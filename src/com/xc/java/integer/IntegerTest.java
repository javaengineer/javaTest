package com.xc.java.integer;

import java.lang.reflect.Field;

/**
 * 方法外的变量和原先的变量指向不同，所以直接无法交换，采用反射，改变里面的值
 * Java中对象是按引用传的，但是传的是引用的值
 */
public class IntegerTest {
    public static void main(String[] args) throws Exception{
        Integer a = 1;
        // b是引用，存在栈中，2等于new Integer(2) 在堆中开辟一个内存存放对象
        Integer b = 2;

        swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }

    private static void swap(Integer a, Integer b) throws Exception {
        /*Java中采用值传递，这个方法里新建两个引用接受穿过来的值（实际是地址），若是对a,b操作的话只是对引用进行操作，
        他们指向的对象并没有任何改变，操作完毕引用销毁，函数外面没有任何变化。所以我们通过反射拿到实际对象，改变堆中的值，那么两个对象就会发生变化*/
        /*
        方法中可以交换两个形参的引用，但是实际上改变不了实参的引用
        Integer temp;
        temp = a;
        a = b;
        b = temp;*/

        /*Class clazz = Class.forName("java.lang.Integer");

        System.out.println(clazz.getDeclaredFields());
        System.out.println(Integer.class.getFields());*/
        int tem = a.intValue();
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);

        field.setInt(a, b);
        field.setInt(b, tem);
    }
}
