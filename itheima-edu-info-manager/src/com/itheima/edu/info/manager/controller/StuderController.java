package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

//客服
public class StuderController extends BaseStuderController{
   private Scanner sc = new Scanner(System.in);

    public Student inputStudentinfo(String sid){
        System.out.println("学生姓名");
        String name = sc.next();
        System.out.println("学生年龄");
        String age = sc.next();
        System.out.println("学生生日");
        String brithday = sc.next();
        Student stu = new Student();
        stu.setId(sid);
        stu.setName(name);
        stu.setAge(age);
        stu.setBrithday(brithday);
        return stu;
    }
}
