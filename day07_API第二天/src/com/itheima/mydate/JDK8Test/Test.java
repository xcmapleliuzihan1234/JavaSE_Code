package com.itheima.mydate.JDK8Test;
/*
��ȡ��������
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year = sc.nextInt();
        LocalDate localDate = LocalDate.of(year,03,01);
        LocalDate localDate1 = localDate.plusDays(-1);
        System.out.println("���������" + localDate1.getDayOfMonth() + "��");
    }
}
