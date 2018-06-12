package com.xc.java.pattern.singleton.register;

/**
 * Create by Administrator on 2018/6/8 13:40
 **/
public enum Color {
    RED(){
        private int r = 255;
        private int g = 0;
        private int b = 0;

    },BLACK(){
        private int r = 0;
        private int g = 0;
        private int b = 0;
    },WHITE(){
        private int r = 255;
        private int g = 255;
        private int b = 255;
    };

}
