package com.xc.java.pattern.prototype.deep;


/**
 * Create by Administrator on 2018/6/8 17:15
 **/
public class CloneTargetTest {

    public static void main(String[] args) {

        CloneTarget target = new CloneTarget();
        target.name = "xc";
        target.target = new CloneTarget();

        // 两个不同对象  是深拷贝了
        System.out.println(target.target);

        try {
            CloneTarget t = (CloneTarget) target.clone();
            System.out.println(t.target);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
