package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.OtherStuderController;
import com.itheima.edu.info.manager.controller.StuderController;
import com.itheima.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

//程序入口
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //菜单搭建
        while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");

            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                   // 进入学生管理系统
                    OtherStuderController studerController = new OtherStuderController();
                    studerController.start();
                    break;
                case 2 :
                  //  进入老师管理系统
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case 3 :
                    System.out.println("感谢您的使用！");
                    System.exit(0);
                default:
                    System.out.println();
                    break;
            }
        }

    }
}
