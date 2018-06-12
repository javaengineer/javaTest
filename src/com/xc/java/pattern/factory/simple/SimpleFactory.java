package com.xc.java.pattern.factory.simple;

import com.xc.java.pattern.factory.Menniu;
import com.xc.java.pattern.factory.Milk;
import com.xc.java.pattern.factory.Yili;

/**
 * @author Administrator
 * 简单工厂
 * 与客户耦合性高，需要手动输入使用哪个厂家
 */
public class SimpleFactory {

    public String getMilk(String name) {
        if ("mengniu".equals(name)) {
            return new Menniu().getName();
        }else if ("yili".equals(name)) {
            return new Yili().getName();
        }else {
            return "还没有生成对象";
        }
    }
}
