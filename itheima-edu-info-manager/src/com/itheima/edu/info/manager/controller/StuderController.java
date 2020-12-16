package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

//客服
public class StuderController {
    private StudentService studentService = new StudentService();
   private Scanner sc = new Scanner(System.in);

    public void start() {

        //搭建学生菜单
        io:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            int choice = sc.nextInt();
            //创建StudentService对象，调用方法

            switch (choice) {
                case 1:
                    // 添加学生
                    addStudent();

                    break;
                case 2:
                    // 删除学生
                    deleteStudent();
                    break;
                case 3:
                    // 修改学生
                    setStudent();
                    break;
                case 4:
                    //查询学生
                    findStudent();
                    break;
                case 5:
                    System.out.println("您已退出学生管理系统！");
                    break io;
                default:
                    System.out.println();
                    break;
            }
        }

    }


//查看学生
    public void findStudent() {
        Student[] stus = studentService.findStudent();
        boolean res = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
               res =true;
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge() + " " + stu.getBrithday());
            }
        }if(res ==false){
            System.out.println("信息为空！");
        }
    }
    public void setStudent() {

    }

    public void deleteStudent() {

    }

    public void addStudent() {
        //1.添加学生
        String id;
        while(true){
    System.out.println("学生学号");
    id = sc.next();
   // StudentService studentService1 = new StudentService();
    boolean flag = studentService.isExisit(id);
    if(flag){
        System.out.println("当前学号已存在，请重新录入！");
    }else {
        break;
    }
}

        System.out.println("学生姓名");
        String name = sc.next();
        System.out.println("学生年龄");
        String age = sc.next();
        System.out.println("学生生日");
        String brithday = sc.next();
        Student stu = new Student(id, name, age, brithday);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }
    }
}
