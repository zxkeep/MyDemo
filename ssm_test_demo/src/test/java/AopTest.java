import com.zhengxu.controller.UserController;
import com.zhengxu.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AopTest extends BaseTest {

    @Autowired
    private UserController userController;

    @Test
    public void insert() {
        User s = userController.testAop(4, 5);
        System.out.println(s);
    }


}
