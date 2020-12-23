package com.itheima.mydate.date03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
���ڸ�ʽ����SimpleDateFormat
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat spf = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
        String time = spf.format(date);
        System.out.println("time = " + time);

        String time2 = "1999��2��16��";
        SimpleDateFormat spf1 = new SimpleDateFormat("yyyy��MM��dd��");
        Date parse = spf1.parse(time2);
        System.out.println("parse = " + parse);

        //�����Լ�����������
        long time1 = date.getTime();
        long time3 = parse.getTime();
        System.out.println((time1 - time3) / (1000L * 3600 * 24));
    }
}
