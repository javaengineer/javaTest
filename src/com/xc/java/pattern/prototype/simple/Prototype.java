package com.xc.java.pattern.prototype.simple;

import com.xc.java.pattern.prototype.simple.CloneTarget;

/**
 * Create by Administrator on 2018/6/8 17:10
 **/
public class Prototype implements Cloneable {

    public String name;

    CloneTarget target = null;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
