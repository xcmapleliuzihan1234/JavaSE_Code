package com.itheima.mydate.calendatest;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        c.add(Calendar.DATE,-1);
        System.out.println("���������" + c.get(Calendar.DATE) + "��");

    }
}
