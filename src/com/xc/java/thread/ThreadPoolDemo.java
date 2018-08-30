package com.xc.java.thread;

/**
 * Create by Administrator on 2018/8/30 15:01
 **/
public class ThreadPoolDemo {
    public static volatile int count = 0;
    public static void inc() {
        count++;
    }
    public static void main(String[] args) {
        /*ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                ThreadPoolDemo.inc();
                System.out.println(Thread.currentThread().getName());
            });
        }


        executorService.shutdown();*/
        /*CountDownLatch downLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                ThreadPoolDemo.inc();
                try {
                    downLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            downLatch.countDown();
        }*/
        System.out.println(count);

    }
}
