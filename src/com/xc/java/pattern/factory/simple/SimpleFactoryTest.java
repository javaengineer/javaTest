package com.xc.java.pattern.factory.simple;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("mengniu"));
    }

}
