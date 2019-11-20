import cn.lilyhuli.bean.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        //解析beans.xml 文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        Hello hello = (Hello)context.getBean("hello");
        hello.show();

    }


}
