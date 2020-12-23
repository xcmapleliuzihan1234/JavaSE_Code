package com.itheima.mydate.date03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
日期格式化：SimpleDateFormat
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat spf = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        String time = spf.format(date);
        System.out.println("time = " + time);

        String time2 = "1999年2月16日";
        SimpleDateFormat spf1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = spf1.parse(time2);
        System.out.println("parse = " + parse);

        //计算自己出生多少天
        long time1 = date.getTime();
        long time3 = parse.getTime();
        System.out.println((time1 - time3) / (1000L * 3600 * 24));
    }
}
