package com.xc.java.thread;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Create by Administrator on 2018/8/28 22:30
 **/
public class ReentrantReadWriteLockTest {
    private static Map<String, Object> map = Maps.newHashMap();
    static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    static Lock readLock = lock.readLock();
    static Lock writeLock = lock.writeLock();

    public static String get(String key) {
        readLock.lock();
        String result = map.get(key).toString();
        readLock.unlock();
        return result;
    }

    public static void put(String key, Object value) {
        writeLock.lock();
        map.put(key, value);
        writeLock.unlock();

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
        }
    }

}
