package com.zhengxu.jwtTest;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zhengxu.domain.User;
import io.jsonwebtoken.*;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengxu
 * @version 1.0.0
 * @create 2019-12-27 14:23
 * @desc
 */
public class TestJwt {

    public static final String TOKEN = "eyJhbGciOiJIUzI1NiIsIlR5cGUiOiJKd3QiLCJ0eXAiOiJKV1QifQ.eyJpYXQiOjE1Nzc2ODYzNzYsImp0aSI6IjEwMCJ9.YQkkfDkHK3eYVj_kaUXqNwBF-ove6-4yk7ikNLe0rA8";
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    private static final String TOKEN_SECRET = "thefirsttoken123";
    public static void main1(String[] args) {
        User user = new User();
        user.setId(100);
        user.setUseAge(28);
        user.setUseName("keep");
        JwtBuilder builder= Jwts.builder()
                .setId("100")    //设置唯一编号
                .setSubject("keep") //设置主题  可以是JSON数据
                .setIssuedAt(new Date()) //设置签发日期
               // .setExpiration(DateUtils.addMinutes(new Date(),3))
                .claim("user",user)
                .signWith(SignatureAlgorithm.HS256,"testjwt");//设置签名 使用HS256算法，并设置SecretKey(字符串)构建 并返回一个字符串
        System.out.println( builder.compact() );
    }

    public static void main3(String[] args) {

        Claims claims = null;
        Header header=null;
        try {
            claims = Jwts.parser().setSigningKey("testjwt").parseClaimsJws(TOKEN).getBody();
            header = Jwts.parser().setSigningKey("testjwt").parseClaimsJws(TOKEN).getHeader();
        } catch (Exception e) {
            System.out.println("=======错误信息"+e.getMessage());
        }
        System.out.println(claims);
        System.out.println(header);
    }

    public static void main5(String[] args) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).build();
        try {
           jwtVerifier.verify(TOKEN);
        } catch (JWTVerificationException e) {
            throw new RuntimeException("401");
        }
    }

    /**
     * 生成签名，15分钟过期
     * @param **username**
     * @param **password**
     * @return
     */
    public static String sign() {
        try {
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type", "Jwt");
            header.put("alg", "HS256");
            // 返回token字符串
            return JWT.create()
                    .withHeader(header)
                    .withJWTId("653432")
                    .withIssuedAt(new Date())
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 从token中获取username信息
     * @param **token**
     * @return
     */
    public static String getId(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getId();
        } catch (JWTDecodeException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String sign = sign();
       // sign = "ayJhbGciOiJIUzI1NiIsIlR5cGUiOiJKd3QiLCJ0eXAiOiJKV1QifQ.eyJpYXQiOjE1Nzc3NTc0MzksImp0aSI6IjEwMCJ9.mt_nMQwXbqPkncREXKAVSIcwO2A8oVNpbecYBxdBi94";
        System.out.println(sign);
        String id = getId(sign);
        System.out.println(id);
    }
}
