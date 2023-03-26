package aop.aops;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/22 - 18:38
 * @apiNote 被增强类
 */
@Component
public class User {
    public void userMessage(){
        System.out.println("用户发送了一条消息");
    }


}
