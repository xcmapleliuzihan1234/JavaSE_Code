package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

//�ͷ�
public class OtherStuderController extends BaseStuderController {
   private Scanner sc = new Scanner(System.in);

    public Student inputStudentinfo(String sid){
        System.out.println("ѧ������");
        String name = sc.next();
        System.out.println("ѧ������");
        String age = sc.next();
        System.out.println("ѧ������");
        String brithday = sc.next();
        Student stu = new Student(sid,name,age,brithday);
        return stu;
    }
}