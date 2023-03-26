package aop.dynamic.proxy;

import aop.dynamic.service.Calculator;
import aop.dynamic.service.CalculatorImpl;


/**
 * @author kinoz
 * @Date 2022/7/21 - 10:29
 * @apiNote 动态代理测试
 */
public class ProxyTest {
    public static void main(String[] args) {
        //代理类中传入被代理对象
        var proxy = new CalculatorProxy(new CalculatorImpl());

        //通过我们的自定义方法实现代理操作
        Calculator calculator = (Calculator) proxy.getProxy();


        //除了输出方法中的结果外 还会在前后添加代理的代码
        calculator.add(1,2);
    }
}
