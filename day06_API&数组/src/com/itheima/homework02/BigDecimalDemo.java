package com.itheima.homework02;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ����ĵ�һ������");
        String num1 = sc.next();
        BigDecimal bd1 = new BigDecimal(num1);
        System.out.println("������Ҫ����ĵڶ�������");
        String num2 = sc.next();
        BigDecimal bd2 = new BigDecimal(num2);
        System.out.println("��������Ҫ���еĲ�������1���ӷ� 2������ 3���˷� 4��������");
        String num3 = sc.next();
        switch (num3){
            case "1":
                System.out.println(bd1 + " + " + bd2 + " = " + bd1.add(bd2));
                break;
            case "2":
                System.out.println(bd1 + " - " + bd2 + " = " + bd1.subtract(bd2));
                break;
            case "3":
                System.out.println(bd1 + " * " + bd2 + " = " + bd1.multiply(bd2));
                break;
            case "4":
                System.out.println(bd1 + " / " + bd2 + " = " + bd1.divide(bd2));
                break;
            default:
                    System.out.println("�������");
                    break;
        }
    }
}
