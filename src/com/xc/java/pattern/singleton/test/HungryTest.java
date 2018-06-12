package com.xc.java.pattern.singleton.test;

import com.xc.java.pattern.singleton.hungry.Hungry;

import java.util.concurrent.CountDownLatch;

/**
 * Create by Administrator on 2018/6/8 10:35
 **/
public class HungryTest {

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

                    Hungry hungry = Hungry.getInstance();

                    System.out.println(hungry);
                }
            }).start();
            latch.countDown();
        }
        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - begin));
    }
}
