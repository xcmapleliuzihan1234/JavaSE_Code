package com.itheima.mydate.JDK8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("��" + localDateTime.getYear());

        System.out.println("��" + localDateTime.getMonthValue());

        System.out.println("һ����" + localDateTime.getDayOfYear());

        System.out.println("һ����" + localDateTime.getDayOfMonth());

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("��" + dayOfWeek.getValue());

        System.out.println("Сʱ" + localDateTime.getHour());

        System.out.println("����" + localDateTime.getMinute());


    }
}
