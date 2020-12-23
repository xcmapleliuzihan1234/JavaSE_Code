package com.itheima.mydate.JDK8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("年" + localDateTime.getYear());

        System.out.println("月" + localDateTime.getMonthValue());

        System.out.println("一年中" + localDateTime.getDayOfYear());

        System.out.println("一月中" + localDateTime.getDayOfMonth());

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("周" + dayOfWeek.getValue());

        System.out.println("小时" + localDateTime.getHour());

        System.out.println("分钟" + localDateTime.getMinute());


    }
}
