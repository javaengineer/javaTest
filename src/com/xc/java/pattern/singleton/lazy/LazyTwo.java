package com.xc.java.pattern.singleton.lazy;

/**
 * Create by Administrator on 2018/6/8 10:51
 * 懒汉式
 * 进化为线程安全的，但是在方法上加synchronized很耗时
 **/
public class LazyTwo {

    private LazyTwo(){

    }

    private static LazyTwo instance = null;

    public static synchronized LazyTwo getInstance() {
        if (instance == null) {
            instance = new LazyTwo();
        }
        return instance;
    }

}
