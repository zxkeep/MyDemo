import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.Set;


public class JedisTest extends BaseTest{

    @Autowired
    private JedisPool jedisPool;

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


    }
}
