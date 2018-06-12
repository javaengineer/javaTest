package com.xc.java.pattern.factory.abstr;

/**
 * @author Administrator
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MilkFactory();

        // 只需要关注需要什么厂家，直接取就可以
        System.out.println(abstractFactory.getMengniuMilk());
    }
}
