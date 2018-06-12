package com.xc.java.pattern.singleton.hungry;

/**
 * Create by Administrator on 2018/6/8 10:27
 * 饿汉式
 * 它是在类加载的时候就立即初始化，并且创建单例对象
 * 线程安全的，效率高
 * 但是有可能使用不到，占用内存，浪费资源
 **/
public class Hungry {

    private static final Hungry hungry = new Hungry();
    private Hungry(){}

    public static Hungry getInstance() {
        return hungry;
    }
}
