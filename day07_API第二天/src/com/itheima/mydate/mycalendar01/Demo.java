package com.itheima.mydate.mycalendar01;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2011,11,11);

        System.out.println(c.get(Calendar.YEAR) + "��");
        System.out.println(c.get(Calendar.MONTH) + 1 + "��");
        System.out.println(c.get(Calendar.DATE) + "��");

        System.out.println("--------------------");
        c.set(Calendar.YEAR,2020);
        c.set(Calendar.MONTH,12);
        c.set(Calendar.DATE,23);

        System.out.println(c.get(Calendar.YEAR) + "��");
        System.out.println(c.get(Calendar.MONTH)+ "��");
        System.out.println(c.get(Calendar.DATE) + "��");
    }
}
