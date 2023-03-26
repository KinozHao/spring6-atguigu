package aop.aops;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Hao Kinoz
 * @Description
 * @Date 2023/3/26
 **/
public class UserTest {
    @Test
    public void aopTest(){
        //基于注解测试
        final var context = new ClassPathXmlApplicationContext("bean.xml");
        final User user = context.getBean("user", User.class);
        user.userMessage();
    }
}
