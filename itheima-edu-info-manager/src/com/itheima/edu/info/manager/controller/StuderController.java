package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

//�ͷ�
public class StuderController {
    private StudentService studentService = new StudentService();
   private Scanner sc = new Scanner(System.in);

    public void start() {

        //�ѧ���˵�
        io:
        while (true) {
            System.out.println("--------��ӭ���� <ѧ��> ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.���ѧ��  2.ɾ��ѧ��  3.�޸�ѧ��  4.�鿴ѧ��  5.�˳�");
            int choice = sc.nextInt();
            //����StudentService���󣬵��÷���

            switch (choice) {
                case 1:
                    // ���ѧ��
                    addStudent();

                    break;
                case 2:
                    // ɾ��ѧ��
                    deleteStudent();
                    break;
                case 3:
                    // �޸�ѧ��
                    setStudent();
                    break;
                case 4:
                    //��ѯѧ��
                    findStudent();
                    break;
                case 5:
                    System.out.println("�����˳�ѧ������ϵͳ��");
                    break io;
                default:
                    System.out.println();
                    break;
            }
        }

    }


//�鿴ѧ��
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
            System.out.println("��ϢΪ�գ�");
        }
    }
    public void setStudent() {

    }

    public void deleteStudent() {

    }

    public void addStudent() {
        //1.���ѧ��
        String id;
        while(true){
    System.out.println("ѧ��ѧ��");
    id = sc.next();
   // StudentService studentService1 = new StudentService();
    boolean flag = studentService.isExisit(id);
    if(flag){
        System.out.println("��ǰѧ���Ѵ��ڣ�������¼�룡");
    }else {
        break;
    }
}

        System.out.println("ѧ������");
        String name = sc.next();
        System.out.println("ѧ������");
        String age = sc.next();
        System.out.println("ѧ������");
        String brithday = sc.next();
        Student stu = new Student(id, name, age, brithday);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("��ӳɹ���");
        } else {
            System.out.println("���ʧ�ܣ�");
        }
    }
}
