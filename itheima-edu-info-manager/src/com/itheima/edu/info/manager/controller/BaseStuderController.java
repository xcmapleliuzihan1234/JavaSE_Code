package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;
//开闭原则：不改变原代码
//客服
public abstract class BaseStuderController {
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
    Student[] stus = studentService.findStudent();

//查看学生
    public final void findStudent() {
        Student[] stus = studentService.findStudent();
        //判断全空是为了表头好看，否则可以直接传入数组
        if(stus ==null){
            System.out.println("信息为空！");
        }else {
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < stus.length; i++) {
                Student stu = stus[i];
                if (stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBrithday());
                }
            }
        }
    }

    public final void setStudent() {

        String sid = inputStudentid("修改");
        //调用输入信息
        if(studentService.isExisit(sid)){
            Student stu = inputStudentinfo(sid);
           studentService.setStudent(sid,stu);
                System.out.println("修改成功！");
        }
    }

    public final void deleteStudent() {
        String id = inputStudentid("删除");
        if(studentService.isExisit(id)){
            studentService.deleteStudent(id);
            System.out.println("删除成功！");
        }
    }

    public final void addStudent() {
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
        //调用输入
        Student stu = inputStudentinfo(id);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }
    }

    public final String inputStudentid(String arr){
        String sid;
        while (true){

                System.out.println("请输入要" + arr + "的学生学号：");
                sid = sc.next();

                boolean exist = studentService.isExisit(sid);

                if(!exist){
                    System.out.println("学号不存在，检查后重试！");
                   break;
                }else {
                    break;
                }
        } return sid;
    }

    public abstract Student inputStudentinfo(String sid);
}
