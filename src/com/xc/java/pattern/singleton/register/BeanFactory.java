package com.xc.java.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Create by Administrator on 2018/6/8 13:25
 * 注册式单例
 *
 **/
public class BeanFactory {

    private BeanFactory(){}

    // 线程安全
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){

        if(!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else {
            return ioc.get(className);
        }

    }

}
