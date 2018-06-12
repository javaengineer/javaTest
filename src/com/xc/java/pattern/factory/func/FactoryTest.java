package com.xc.java.pattern.factory.func;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MengniuFactory();

        System.out.println(factory.getMilk());
    }
}
