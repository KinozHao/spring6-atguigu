package aop.dynamic.service;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:24
 * @apiNote 计算器实现类
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int result = a+b;
        System.out.println("The param sum is: "+result);
        return result;
    }

}
