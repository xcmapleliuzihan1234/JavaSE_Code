package com.itheima.mydate.mycalendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "��");
        System.out.println(c.get(Calendar.MONTH) + 1 + "��");
        System.out.println("һ���еĵ�" + c.get(Calendar.DAY_OF_YEAR) + "��");
        System.out.println("һ���еĵ�" + c.get(Calendar.DAY_OF_MONTH) + "��");
        System.out.println("����" + (c.get(Calendar.DAY_OF_WEEK) - 1 ));
    }
}
