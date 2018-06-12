package com.xc.java.thread;


import com.xc.java.copy.Address;

public class ThreadTest11 {

    public static ThreadTest11 test = null;

    private Address Address = new Address();
    public ThreadTest11() {
        test = this;
    }

    public static void main(String[] args) throws Exception {
        final Object o = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    try {
                        o.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    ThreadTest test = new ThreadTest();
                    System.out.println(test);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    o.notify();
                    System.out.println(test);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
