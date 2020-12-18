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
                    deleteTeacher();
                    break;
                case 3 :
                    //�޸�
                    setTeater();
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
    Teacher[] stus = ts.findAllTeacher();
    public void setTeater() {
        //���û�ȡ���ڵ�id
      String sid =  inputTeachrtid("�޸�");
        if(ts.isExisit(sid)){
            Teacher tch = inputTeacherinfo(sid);
            ts.setTeacher(sid,tch);
            System.out.println("�޸ĳɹ���");
        }
    }

    public void deleteTeacher() {
        Teacher[] stus = ts.findAllTeacher();
        String id = inputTeachrtid("ɾ��");
        if(ts.isExisit(id)){
            ts.deleteStudent(id);
            System.out.println("ɾ���ɹ���");
        }
    }

    public void findAllTeacher() {

        Teacher[] tchs = ts.findAllTeacher();
        if(tchs ==null){
            System.out.println("��ϢΪ�գ�");
        }else {
            System.out.println("����\t\t����\t����\t����");
            for (int i = 0; i < tchs.length; i++) {
                Teacher tch = tchs[i];
                if (tch != null) {
                    System.out.println(tch.getId() + "\t" + tch.getName() + "\t" + tch.getAge() + "\t\t" + tch.getBrithday());
                }
            }
        }
    }

    public void addTeacher() {
        //��鹤���Ƿ��Ѿ�����
        String id;
        while(true){
            System.out.println("�����빤�ţ�");
            id = sc.next();
            boolean flag = ts.isExisit(id);
            if(flag){
                System.out.println("��ǰ�����Ѵ��ڣ����������룡");
            }else {
                break;
            }
        }
        Teacher tch = inputTeacherinfo(id);
        boolean res =  ts.addTeacher(tch);
       if(res){
           System.out.println("��ӳɹ���");
       }else {
           System.out.println("���ʧ�ܣ�");
       }
    }

    public String inputTeachrtid(String arr){
        String sid;
        while (true){

                System.out.println("������Ҫ" + arr + "����ʦ���ţ�");
                sid = sc.next();

                boolean exist = ts.isExisit(sid);

                if(!exist){
                    System.out.println("���Ų����ڣ��������ԣ�");
                  break;
                }else {
                    break;
                }
        }return sid;
    }

    public Teacher inputTeacherinfo(String id){
        System.out.println("������������");
        String name = sc.next();
        System.out.println("���������䣺");
        String age = sc.next();
        System.out.println("���������գ�");
        String birthday = sc.next();
        //������ʦ����
        Teacher tch = new Teacher(id,name,age,birthday);

        return tch;
    }
}
