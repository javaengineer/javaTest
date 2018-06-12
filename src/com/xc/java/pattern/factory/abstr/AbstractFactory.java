package com.xc.java.pattern.factory.abstr;

/**
 * 抽象工厂
 *
 * 把所有的厂家放这里统一管理，便于扩展
 */
public abstract class AbstractFactory {

    public abstract String getMengniuMilk();

    public abstract String getYiliMilk();
}
