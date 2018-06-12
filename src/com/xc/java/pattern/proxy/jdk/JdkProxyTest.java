package com.xc.java.pattern.proxy.jdk;

import com.xc.java.pattern.proxy.DaJun;
import com.xc.java.pattern.proxy.Person;

/**
 * Create by Administrator on 2018/6/12 10:41
 **/
public class JdkProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new JDKMeipo().getInstance(new DaJun());
        System.out.println(person.getClass());

        person.findLove();
    }
}
