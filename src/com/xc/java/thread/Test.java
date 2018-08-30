package com.xc.java.thread;

/**
 * Create by Administrator on 2018/8/27 15:40
 **/
public class Test {
    public int inc() {
        int x;
        try {

            x = 1;
            return x;
        }catch (Exception e) {
            x = 2;
            return x;
        }finally {
            x = 3;
        }
    }
    class innerClass {
        int y = 1;
    }
}
