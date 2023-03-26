package aop.aops;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/22 - 19:39
 * @apiNote 增强类2
 */
@Component
@Aspect
public class StudentProxy {

    @Before(value = "execution(* aop.aops.User.userMessage(..))")

    //此注解设置优先级 数字小等级高
    @Order(0)
    public void First(){
        System.out.println(this.getClass()+"Order指数低,执行在最前");
    }
}
