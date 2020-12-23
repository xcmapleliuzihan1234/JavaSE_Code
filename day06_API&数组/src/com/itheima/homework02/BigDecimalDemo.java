package com.itheima.homework02;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要输入的第一个数：");
        String num1 = sc.next();
        BigDecimal bd1 = new BigDecimal(num1);
        System.out.println("请输入要输入的第二个数：");
        String num2 = sc.next();
        BigDecimal bd2 = new BigDecimal(num2);
        System.out.println("请输入您要进行的操作：（1、加法 2、减法 3、乘法 4、除法）");
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
                    System.out.println("输入错误");
                    break;
        }
    }
}
