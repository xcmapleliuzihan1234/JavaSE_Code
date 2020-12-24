package com.itheima.mythrow.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      //  method1(sc);//无参构造
    //有参构造
            try {
                Student stu1 = new Student("张三",22);
                System.out.println(stu1.toString());
            } catch (AgeOutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }

    private static void method1(Scanner sc) {
        Student stu2 = new Student();
        System.out.println("请输入姓名：");
        String name = sc.next();
        stu2.setName(name);
        while (true){
            try {
                System.out.println("请输入年龄");
                int age = sc.nextInt();
                stu2.setAge(age);
                break;
            } catch (AgeOutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println(stu2.toString());
    }
}
