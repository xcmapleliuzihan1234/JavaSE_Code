package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;
import com.itheima.edu.info.manager.uitl.DateUitl;

import java.util.Scanner;

//客服
public class OtherStuderController extends BaseStuderController {
   private Scanner sc = new Scanner(System.in);

    public Student inputStudentinfo(String sid){
        System.out.println("学生姓名：");
        String name = sc.next();
        System.out.println("学生生日（格式：2020-12-24）：");
        String brithday = sc.next();
        String age = DateUitl.getAge(brithday);
      //  根据返回值操作数组
        if (age.equals("-1")){
            return null;
        }else {
            Student stu = new Student(sid,name,age,brithday);
            return stu;
        }
    }
}
