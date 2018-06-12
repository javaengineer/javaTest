package com.xc.java.copy;

public class Student1 implements Cloneable{
    private String name;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        Student1 stu = null;
        stu = (Student1) super.clone(); // 浅拷贝
        stu.address = (Address) address.clone();    // 引用类型的拷贝，深拷贝
        return stu;
    }
}
