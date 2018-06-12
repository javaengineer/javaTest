package com.xc.java.pattern.singleton.test;

import com.xc.java.pattern.singleton.hungry.Hungry;
import com.xc.java.pattern.singleton.lazy.LazyThree;
import com.xc.java.pattern.singleton.register.BeanFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Create by Administrator on 2018/6/8 13:30
 **/
public class BeanFactoryTest {

    public static void main(String[] args) {
        int count = 200;

        CountDownLatch latch = new CountDownLatch(count);

        long begin = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //必然会调用，可能会有很多线程同时去访问getInstance()
                    Object obj = BeanFactory.getBean("com.xc.java.pattern.singleton.test.Pojo");
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            }).start();
            latch.countDown();
        }
        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - begin));
    }
}
