import cn.lilyhuli.dao.UserDaoOracleImpl;
import cn.lilyhuli.service.UserService;
import cn.lilyhuli.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void test1() {

        UserService service = new UserServiceImpl();
        service.getUser();

    }

    /**
     * 那么我们要使用Oracle ,
     * 又需要去service实现类里面修改对应的实现 .
     * 假设我们的这种需求非常大 ,
     * 这种方式就根本不适用了, 甚至反人类对吧 ,
     * 每次变动 , 都需要修改大量代码 .
     * 这种设计的耦合性太高了, 牵一发而动全身 .
     */
    @Test
    public void test2() {
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserDaoOracleImpl());
        service.getUser();

    }

    @Test
    public void springTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("userServiceImpl");
        userServiceImpl.getUser();

    }


}
