package com.xc.java.hashmap;

import java.util.HashMap;

/**
 * 测试源码中是怎么put值的。
 * 1. 刚开始table是空的，需要初始化table，默认长度为2的4次方
 * 2. 寻址，拿数组的长度（15 二进制为1111）与key的hash值进行与操作（足够分散），把值放入
 * 3. 若是找到的地址已经有值，则放入该节点的下一个位置，生成单向链表，当长度大于8时转为红黑树
 * 4. 若是数组长度超过最大容量*因子值（12）了，需要进行扩容；重新计算原数组的地址
 */
public class HashMapTest {

    public static void main(String[] args) {
        hashMap();
    }

    private static void hashMap() {
        HashMap hashMap = new HashMap();

        hashMap.put("1", "xc");
        hashMap.put("2", "ys");
        hashMap.put("3", "xc");
        hashMap.put("4", "ys");
        hashMap.put("5", "xc");
        hashMap.put("6", "ys");
        hashMap.put("7", "xc");
        hashMap.put("8", "ys");
        hashMap.put("9", "xc");
        hashMap.put("10", "ys");
        hashMap.put("11", "xc");
        hashMap.put("12", "ys");
        hashMap.put("13", "xc");
        hashMap.put("14", "ys");
        hashMap.put("15", "xc");
        hashMap.put("16", "ys");
        hashMap.put("17", "xc");
        hashMap.put("sss", "ys");

        hashMap.get("1");
        hashMap.get("17");
    }
}
