package com.xc.java.pattern.proxy;

/**
 * Create by Administrator on 2018/6/12 15:50
 **/
public class DaJun implements Person{

    @Override
    public void findLove(){
        System.out.println("大俊找媳妇了。。。");
    }

    @Override
    public void findJob() {
        System.out.println("大俊找工作了。。。");
    }
}
