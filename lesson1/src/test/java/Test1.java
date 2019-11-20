import cn.lilyhuli.service.UserService;
import cn.lilyhuli.service.UserServiceImpl;
import org.junit.Test;

public class Test1 {

    @Test
    public void test1() {

        UserService service = new UserServiceImpl();
        service.getUser();
    }


}
