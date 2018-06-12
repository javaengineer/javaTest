package com.xc.java.pattern.proxy.cglib;

import com.xc.java.pattern.proxy.DaJun;
import com.xc.java.pattern.proxy.Person;

/**
 * Create by Administrator on 2018/6/12 10:40
 **/
public class CglibProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new CglibMeipo().getInstance(DaJun.class);
        System.out.println(person.getClass());
        person.findLove();
    }
}
