package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {

    public void start() {
        Scanner sc = new Scanner(System.in);
        io: while (true){
            System.out.println("--------��ӭ���� <��ʦ> ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.�����ʦ  2.ɾ����ʦ  3.�޸���ʦ  4.�鿴��ʦ  5.�˳�");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    // ���
                    addTeacher();
                    break;
                case 2 :
                    //ɾ��
                    break;
                case 3 :
                    //�޸�
                    break;
                case 4 :
                   //��ѯ
                    findAllTeacher();
                    break;
                case 5 :
                    System.out.println("��л����ʹ�ã�");
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
            System.out.println("��ϢΪ�գ�");
        }
    }

    Scanner sc = new Scanner(System.in);
   TeacherService tc = new TeacherService();

    public void addTeacher() {
        //��鹤���Ƿ��Ѿ�����
        String id;
        while(true){
            System.out.println("�����빤�ţ�");
            id = sc.next();
            boolean flag = tc.isExisit(id);
            if(flag){
                System.out.println("��ǰ�����Ѵ��ڣ����������룡");
            }else {
                break;
            }
        }
            System.out.println("������������");
             String name = sc.next();
        System.out.println("���������䣺");
        String age = sc.next();
        System.out.println("���������գ�");
        String birthday = sc.next();
        //������ʦ����
        Teacher tch = new Teacher(id,name,age,birthday);

       boolean res =  tc.addTeacher(tch);
       if(res){
           System.out.println("��ӳɹ���");
       }else {
           System.out.println("���ʧ�ܣ�");
       }
    }
}
