package aop.dynamic.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author kinoz
 * @Date 2022/7/22 - 20:32
 * @apiNote 计算器的代理类
 */

class CalculatorProxy{

    //使用Object让方法通用,有参数构造传递
    private Object target;
    public CalculatorProxy(Object target){
        this.target = target;
    }

    public Object getProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            //第一个:代理对象
            //第二个:需要重写目标对象的方法
            //第三个:method方法里的参数

            //方法调用前输出
            System.out.println("method name:"+method.getName() + " params:" + Arrays.toString(args));
            //调用目标方法
            Object result = method.invoke(target, args);
            //方法调用后输出
            System.out.println("method name:"+method.getName() + " params:" + result);

            return result;
        };
        //ClassLoader loader 加载动态生成代理类的类加载器
        //Class<?>[] interfaces 目标对象实现所有接口的class类型数组
        //InvocationHandler 设置代理对象实现目标对象方法的国臣
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
