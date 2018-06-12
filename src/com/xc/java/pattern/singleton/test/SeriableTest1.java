package com.xc.java.pattern.singleton.test;

import com.xc.java.pattern.singleton.seriable.Seriable;

import java.io.*;

/**
 * Create by Administrator on 2018/6/8 13:46
 **/
public class SeriableTest1 {

    public static void main(String[] args) throws IOException {
        // 写入文件的形式
        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        ObjectOutputStream objectOutputStream = null;
        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("Seriable"));
            objectOutputStream.writeObject(s2);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }

        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("Seriable"));
            s1 = (Seriable)objectInputStream.readObject();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


    }
}
