package c_inoutbean;

import c_inoutbean.entity.Staff;
import c_inoutbean.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/17 - 9:13
 * @apiNote 内部外部Bean测试
 */
public class InOutBeanTest {
    @Test
    public void outBean(){
        //外部bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c_inoutbean.xml");
        //获取配置创建的对象
        UserService use = context.getBean("userService", UserService.class);
        use.add();

        System.out.println("-----------------------------------");
        //内部bean
        Staff em1 = context.getBean("employee", Staff.class);
        em1.showInfo();

        System.out.println("-----------------------------------");
        Staff em2 = context.getBean("employee2", Staff.class);
        em2.showInfo();

    }
}
