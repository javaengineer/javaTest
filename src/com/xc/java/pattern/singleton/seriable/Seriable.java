package com.xc.java.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * Create by Administrator on 2018/6/8 13:45
 * 序列化和反序列化会破环单例
 **/
public class Seriable implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new

    private final static Seriable INSTANCE = new Seriable();
    private static final long serialVersionUID = -3827353417130494737L;

    private Seriable(){}

    public static  Seriable getInstance(){
        return INSTANCE;
    }

    private  Object readResolve(){
        return  INSTANCE;
    }

}
