import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


public class JedisTest extends BaseTest{

    @Autowired
    private JedisPool jedisPool;

    @Test
    public void  testJedis(){

        Jedis jedis = jedisPool.getResource();
        String s = jedis.get("hobby");
        System.out.println(s);
    }
}
