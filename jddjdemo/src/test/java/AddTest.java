import com.zhengxu.domain.Product;
import com.zhengxu.mapper.ProductMapper;
import com.zhengxu.service.IProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AddTest extends BaseTest {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private IProductService productService;

    @Test
    public void insert() {
        Product product = getPro();
        productMapper.insert(product);
    }

    @Test
    public void add() {
        Product product = getPro();
        productService.add(product);
        System.out.println(productService);
    }

    private Product getPro(){
        Product product = new Product();
        product.setProName("wwww");
        product.setDescrption("asdfghifds");
        product.setProPrice(100);
        return product;
    }
}
