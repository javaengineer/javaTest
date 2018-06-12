package com.xc.java.copy;

public class Test {


    public static void main(String[] args) throws Exception {
//        noClone();
//        shallowClone();
        deepClone();
    }

    /*没有拷贝，两个对象指向地址一样的*/
    private static void noClone() {
        Student1 student1 = new Student1();
        student1.setName("张三");
        student1.setAge(21);

        Student1 student2 = student1;

        student2.setName("李四");
        System.out.println(student2);
        System.out.println(student1);
        System.out.println(student2.getName() + "---" + student2.getAge());
        System.out.println(student1.getName() + "---" + student1.getAge());
    }
    /*浅拷贝，只拷贝值类型，并不拷贝引用类型*/
    private static void shallowClone() throws Exception {
        Address address = new Address();
        address.setAddress("北京");

        Student1 student1 = new Student1();
        student1.setName("张三");
        student1.setAge(20);
        student1.setAddress(address);

        Student1 student11 = (Student1) student1.clone();
        student11.setName("李四");
        student11.setAge(27);
        address.setAddress("上海");

        System.out.println(student11);
        System.out.println(student1);
        System.out.println(student11.getName() + "---" + student11.getAge() + "---" + student11.getAddress().getAddress());
        System.out.println(student1.getName() + "---" + student1.getAge() + "---" + student1.getAddress().getAddress());
    }

    /*深拷贝，所有类型都进行拷贝*/
    private static void deepClone() throws Exception {
        Address address = new Address();
        address.setAddress("北京");

        Student1 student1 = new Student1();
        student1.setName("张三");
        student1.setAge(20);
        student1.setAddress(address);


        Student1 student11 = (Student1) student1.clone();
        address.setAddress("上海");

        System.out.println(student11);
        System.out.println(student1);
        System.out.println(student1.getName() + "---" + student1.getAge() + "---" + student1.getAddress().getAddress());
        System.out.println(student11.getName() + "---" + student11.getAge() + "---" + student11.getAddress().getAddress());
    }


}
