package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {

    Scanner sc = new Scanner(System.in);
    TeacherService ts = new TeacherService();
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
                    deleteTeacher();
                    break;
                case 3 :
                    //修改
                    setTeater();
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
    Teacher[] stus = ts.findAllTeacher();
    public void setTeater() {
        //调用获取存在的id
      String sid =  inputTeachrtid("修改");
        if(ts.isExisit(sid)){
            Teacher tch = inputTeacherinfo(sid);
            ts.setTeacher(sid,tch);
            System.out.println("修改成功！");
        }
    }

    public void deleteTeacher() {
        Teacher[] stus = ts.findAllTeacher();
        String id = inputTeachrtid("删除");
        if(ts.isExisit(id)){
            ts.deleteStudent(id);
            System.out.println("删除成功！");
        }
    }

    public void findAllTeacher() {

        Teacher[] tchs = ts.findAllTeacher();
        if(tchs ==null){
            System.out.println("信息为空！");
        }else {
            System.out.println("工号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < tchs.length; i++) {
                Teacher tch = tchs[i];
                if (tch != null) {
                    System.out.println(tch.getId() + "\t" + tch.getName() + "\t" + tch.getAge() + "\t\t" + tch.getBrithday());
                }
            }
        }
    }

    public void addTeacher() {
        //检查工号是否已经存在
        String id;
        while(true){
            System.out.println("请输入工号：");
            id = sc.next();
            boolean flag = ts.isExisit(id);
            if(flag){
                System.out.println("当前工号已存在，请重新输入！");
            }else {
                break;
            }
        }
        Teacher tch = inputTeacherinfo(id);
        boolean res =  ts.addTeacher(tch);
       if(res){
           System.out.println("添加成功！");
       }else {
           System.out.println("添加失败！");
       }
    }

    public String inputTeachrtid(String arr){
        String sid;
        while (true){

                System.out.println("请输入要" + arr + "的老师工号：");
                sid = sc.next();

                boolean exist = ts.isExisit(sid);

                if(!exist){
                    System.out.println("工号不存在，检查后重试！");
                  break;
                }else {
                    break;
                }
        }return sid;
    }

    public Teacher inputTeacherinfo(String id){
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        //创建老师对象
        Teacher tch = new Teacher(id,name,age,birthday);

        return tch;
    }
}
