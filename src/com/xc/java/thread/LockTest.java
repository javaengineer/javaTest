package com.xc.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private static int count = 0;
    private static Lock lock = new ReentrantLock();
    public static void inc() {
        lock.lock();
        count++;
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> LockTest.inc()).start();
        }
        Thread.sleep(1000);
        System.out.println(count);
    }
}
