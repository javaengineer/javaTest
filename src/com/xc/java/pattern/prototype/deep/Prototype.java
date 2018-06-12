package com.xc.java.pattern.prototype.deep;

import com.xc.java.pattern.prototype.simple.CloneTarget;

import java.io.*;

/**
 * Create by Administrator on 2018/6/8 17:10
 **/
public class Prototype implements Cloneable, Serializable {
    public String name;


    @Override
    protected Object clone() throws CloneNotSupportedException { return this.deepClone();
    }

    protected Object deepClone() {

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            byte[] bytes = byteArrayOutputStream.toByteArray();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Prototype prototype = (Prototype)objectInputStream.readObject();
            return prototype;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
