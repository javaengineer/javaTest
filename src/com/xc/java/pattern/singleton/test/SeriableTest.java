package com.xc.java.pattern.singleton.test;

import com.xc.java.pattern.singleton.seriable.Seriable;

import java.io.*;

/**
 * Create by Administrator on 2018/6/8 13:46
 **/
public class SeriableTest {

    public static void main(String[] args) throws IOException {
        // 写入字节数组的形式
        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(s2);
        byte[] bytes = byteArrayOutputStream.toByteArray();


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        try {
            s1 = (Seriable) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


    }
}
