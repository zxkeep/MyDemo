package com.zhengxu.jwtTest;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.zhengxu.domain.User;
import io.jsonwebtoken.*;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @author zhengxu
 * @version 1.0.0
 * @create 2019-12-27 14:23
 * @desc
 */
public class TestJwt {

    public static final String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMDAiLCJzdWIiOiJrZWVwIiwiaWF0IjoxNTc3NDI4OTE1LCJ1c2VyIjp7ImlkIjoxMDAsInVzZU5hbWUiOiJrZWVwIiwidXNlUGhvbmUiOm51bGwsInVzZVNleCI6bnVsbCwidXNlQWdlIjoyOCwidXNlTG90dGVyeU51bWJlciI6bnVsbCwiZGF0YURlbGV0ZSI6bnVsbH19.Tlk5ApQTLHgt_TMRdeBs6j6rnhitecL9gvYPGWkr6LY";

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

    public static void main2(String[] args) {

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

    public static void main(String[] args) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("testjwt")).build();
        try {
            jwtVerifier.verify(TOKEN);
        } catch (JWTVerificationException e) {
            throw new RuntimeException("401");
        }
    }
}
