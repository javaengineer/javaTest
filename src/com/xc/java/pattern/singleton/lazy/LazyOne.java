package com.xc.java.pattern.singleton.lazy;

/**
 * Create by Administrator on 2018/6/8 10:47
 * 懒汉式
 * 线程不安全
 **/
public class LazyOne {

    private static LazyOne instance = null;

    private LazyOne(){}
    public static LazyOne getInstance() {
        if (instance == null) {
            instance = new LazyOne();
        }
        return instance;
    }
}
