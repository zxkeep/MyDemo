import com.alibaba.fastjson.JSONObject;
import com.zhengxu.domain.User;
import com.zhengxu.utils.RedisCacheManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class JedisTest extends BaseTest{

    //@Autowired
    private JedisPool jedisPool;

    @Autowired
    private RedisCacheManager redisCacheManager;

    @Test
    public void  testJedis(){

        Jedis jedis = jedisPool.getResource();
        String s = jedis.get("hobby");
        System.out.println(s);
        jedis.set("name", "keep");
        List<String> list = jedis.mget("name", "hobby", "birthday");
        System.out.println(list);
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
        System.out.println("===================================================");
        //StringBuilder sbKey=new StringBuilder();
        ArrayList values = new ArrayList<>();
        for (String key:keys) {
            String value = jedis.get(key);
            values.add(value);
        }
//        String allKeys = sbKey.substring(0, sbKey.length() - 1).toString();
//        System.out.println("-----------"+allKeys);
//        System.out.println("-----------"+sbKey);
//        List<String> values = jedis.mget(allKeys);
        System.out.println("-----------"+values);


    }

    @Test
    public void testAddJsonStr(){
        Jedis jedis = jedisPool.getResource();
        User user = new User();
        user.setExpires_in(222323L);
        user.setTime(33424L);
        user.setToken("234567876543");
        user.setUid(4L);
        user.setUser_nick("keep");
        user.setVenderId(201890328L);
        String value = String.valueOf(user);
        System.out.println("============"+value);
        String json = JSONObject.toJSONString(user);
        System.out.println(json);
        jedis.set(user.getUid().toString(),json);
    }

    @Test
    public void getAll(){
        Set<String> allKeys = redisCacheManager.getAllKeys();
        System.out.println(allKeys);
    }
}
