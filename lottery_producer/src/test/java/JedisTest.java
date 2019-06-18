import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhengxu.domain.Product;
import com.zhengxu.mapper.ProductMapper;
import com.zhengxu.service.IProductService;
import com.zhengxu.utils.RedisCacheManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Set;


public class JedisTest extends BaseTest{

    //@Autowired
   // private JedisPool jedisPool;

    @Autowired
    private RedisCacheManager redisCacheManager;

    @Autowired
    private IProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

//    @Test
//    public void  testJedis(){
//
//        Jedis jedis = jedisPool.getResource();
//        String s = jedis.get("hobby");
//        System.out.println(s);
//        jedis.set("name", "keep");
//        List<String> list = jedis.mget("name", "hobby", "birthday");
//        System.out.println(list);
//        Set<String> keys = jedis.keys("*");
//        System.out.println(keys);
//        System.out.println("===================================================");
//        //StringBuilder sbKey=new StringBuilder();
//        ArrayList values = new ArrayList<>();
//        for (String key:keys) {
//            String value = jedis.get(key);
//            values.add(value);
//        }
////        String allKeys = sbKey.substring(0, sbKey.length() - 1).toString();
////        System.out.println("-----------"+allKeys);
////        System.out.println("-----------"+sbKey);
////        List<String> values = jedis.mget(allKeys);
//        System.out.println("-----------"+values);
//
//
//    }
//
//    @Test
//    public void testAddJsonStr(){
//        Jedis jedis = jedisPool.getResource();
//        User user = new User();
//        user.setExpires_in(222323L);
//        user.setTime(33424L);
//        user.setToken("234567876543");
//        user.setUid(4L);
//        user.setUser_nick("keep");
//        user.setVenderId(201890328L);
//        String value = String.valueOf(user);
//        System.out.println("============"+value);
//        String json = JSONObject.toJSONString(user);
//        System.out.println(json);
//        jedis.set(user.getUid().toString(),json);
//    }

    @Test
    public void getAll(){
        Set<String> allKeys = redisCacheManager.getAllKeys();
        System.out.println(allKeys);
    }
    @Test
    public void getOne(){
        Product o = (Product) redisCacheManager.get("1");
        System.out.println(o);
    }

    @Test
    public void getAllString(){
        Set<String> keys = stringRedisTemplate.keys("*");
        System.out.println(keys);
    }
    @Test
    public void getOneString(){
        String s = stringRedisTemplate.opsForValue().get("product");
        System.out.println(s);
        List<Product> products = JSONObject.parseArray(s, Product.class);
        System.out.println(products);
    }

    @Test
    public void removeAll(){
        Set<String> allKeys = redisCacheManager.getAllKeys();
        for(String key :allKeys ){
            redisCacheManager.del(key);
        }
    }

    @Test
    public void updateToRedis(){
        List<Product> productList = productMapper.selectAll();
        for (Product product: productList){
            Long id = product.getId();
            redisCacheManager.set(String.valueOf(id),product);
        }
        redisCacheManager.set("product", productList);
    }

    @Test
    public void updateToStringRedis(){
        List<Product> productList = productMapper.selectAll();
        for (Product product: productList){
            Long id = product.getId();
            String productString = JSON.toJSONString(product);
            System.out.println(productString);
            stringRedisTemplate.opsForValue().set(String.valueOf(id),productString);
        }
        String productListString = JSON.toJSONString(productList, true);
        System.out.println(productListString);
        stringRedisTemplate.opsForValue().set("product", productListString);
    }

    @Test
    public void getAllProducts(){
        List<Product> productList = productService.getAll();
        for (Product product: productList){
            System.out.println(product);
        }

    }
}
