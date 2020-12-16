package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {

    public void start() {
        Scanner sc = new Scanner(System.in);
        io: while (true){
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    // 添加
                    addTeacher();
                    break;
                case 2 :
                    //删除
                    break;
                case 3 :
                    //修改
                    break;
                case 4 :
                   //查询
                    findAllTeacher();
                    break;
                case 5 :
                    System.out.println("感谢您的使用！");
                    break io;
                default:
                    System.out.println();
                    break;
            }
        }
    }

    public void findAllTeacher() {
        boolean flag = false;
        Teacher[] tchs = tc.findAllTeacher();
        for (int i = 0; i < tchs.length; i++) {
            if(tchs[i]!=null){
                flag =true;
                Teacher tch = tchs[i];
                System.out.println(tch.getId() + " " + tch.getName() + " " + tch.getAge() + " " + tch.getBrithday());
            }
        }if(flag == false){
            System.out.println("信息为空！");
        }
    }

    Scanner sc = new Scanner(System.in);
   TeacherService tc = new TeacherService();

    public void addTeacher() {
        //检查工号是否已经存在
        String id;
        while(true){
            System.out.println("请输入工号：");
            id = sc.next();
            boolean flag = tc.isExisit(id);
            if(flag){
                System.out.println("当前工号已存在，请重新输入！");
            }else {
                break;
            }
        }
            System.out.println("请输入姓名：");
             String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        //创建老师对象
        Teacher tch = new Teacher(id,name,age,birthday);

       boolean res =  tc.addTeacher(tch);
       if(res){
           System.out.println("添加成功！");
       }else {
           System.out.println("添加失败！");
       }
    }
}
