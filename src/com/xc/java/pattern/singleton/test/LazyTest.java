package com.xc.java.pattern.singleton.test;

import com.xc.java.pattern.singleton.lazy.LazyOne;
import com.xc.java.pattern.singleton.lazy.LazyThree;
import com.xc.java.pattern.singleton.lazy.LazyTwo;

import java.util.concurrent.CountDownLatch;

/**
 * Create by Administrator on 2018/6/8 10:35
 **/
public class LazyTest {

    public static void main(String[] args) {
        int count = 200;

        CountDownLatch latch = new CountDownLatch(count);

        long begin = System.currentTimeMillis();
        for (int i = 0; i < count;i ++) {
            new Thread(){
                @Override
                public void run() {
                    try{

                        try {
                            // 阻塞
                            // count = 0 就会释放所有的共享锁
                            // 万箭齐发
                            latch.await();
                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        //必然会调用，可能会有很多线程同时去访问getInstance()
                        Object obj = LazyThree.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + obj);

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start(); //每循环一次，就启动一个线程,具有一定的随机性

            //每次启动一个线程，count --
            latch.countDown();

        }

        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - begin));
    }
}
