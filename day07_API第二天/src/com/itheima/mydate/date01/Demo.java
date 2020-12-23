package com.itheima.mydate.date01;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("time = " + time);
        long time1 = System.currentTimeMillis();
        System.out.println("time1 = " + time1);

        //让时间往后一天
        time = time +1000L * 60 *60 *24;
        date.setTime(time);
        System.out.println("date = " + date);
    }
}
