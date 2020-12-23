package com.itheima.mydate.JDK8Test;
/*
获取二月天数
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        LocalDate localDate = LocalDate.of(year,03,01);
        LocalDate localDate1 = localDate.plusDays(-1);
        System.out.println("今年二月有" + localDate1.getDayOfMonth() + "天");
    }
}
