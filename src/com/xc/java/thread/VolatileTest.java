package com.xc.java.thread;

/**
 * volatile使得变量是可见的，其他线程可以读取
 */
public class VolatileTest {

    public volatile static boolean stop = false;
//    public static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()-> {
           int i = 0;
           while(!stop) {
               i++;
               /*try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }*/
           }
        });

        t.start();
        Thread.sleep(1000);


        System.out.println("执行");
        stop = true;
    }
}
