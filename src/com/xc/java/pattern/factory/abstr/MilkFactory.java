package com.xc.java.pattern.factory.abstr;

import com.xc.java.pattern.factory.Menniu;
import com.xc.java.pattern.factory.Yili;

public class MilkFactory extends AbstractFactory {
    @Override
    public String getMengniuMilk() {
        return new Menniu().getName();
    }

    @Override
    public String getYiliMilk() {
        return new Yili().getName();
    }
}
