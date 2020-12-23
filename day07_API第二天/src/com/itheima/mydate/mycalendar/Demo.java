package com.itheima.mydate.mycalendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "年");
        System.out.println(c.get(Calendar.MONTH) + 1 + "月");
        System.out.println("一年中的第" + c.get(Calendar.DAY_OF_YEAR) + "天");
        System.out.println("一月中的第" + c.get(Calendar.DAY_OF_MONTH) + "天");
        System.out.println("星期" + (c.get(Calendar.DAY_OF_WEEK) - 1 ));
    }
}
