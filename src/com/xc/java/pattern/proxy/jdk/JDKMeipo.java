package com.xc.java.pattern.proxy.jdk;

import com.xc.java.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by Administrator on 2018/6/12 15:51
 **/
public class JDKMeipo implements InvocationHandler {
    /**
     *拿到被代理对象的引用
     */
    private Person target;

    public Object getInstance(Person target) {
        this.target = target;

        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(this.target, args);
        System.out.println("媒婆帮你找对象。。");

        System.out.println("找到了。。");
        return null;
    }
}
