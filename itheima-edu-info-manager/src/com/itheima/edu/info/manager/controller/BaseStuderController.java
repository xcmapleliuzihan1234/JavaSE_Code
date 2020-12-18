package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;
//����ԭ�򣺲��ı�ԭ����
//�ͷ�
public abstract class BaseStuderController {
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
    Student[] stus = studentService.findStudent();

//�鿴ѧ��
    public final void findStudent() {
        Student[] stus = studentService.findStudent();
        //�ж�ȫ����Ϊ�˱�ͷ�ÿ����������ֱ�Ӵ�������
        if(stus ==null){
            System.out.println("��ϢΪ�գ�");
        }else {
            System.out.println("ѧ��\t\t����\t����\t����");
            for (int i = 0; i < stus.length; i++) {
                Student stu = stus[i];
                if (stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBrithday());
                }
            }
        }
    }

    public final void setStudent() {

        String sid = inputStudentid("�޸�");
        //����������Ϣ
        if(studentService.isExisit(sid)){
            Student stu = inputStudentinfo(sid);
           studentService.setStudent(sid,stu);
                System.out.println("�޸ĳɹ���");
        }
    }

    public final void deleteStudent() {
        String id = inputStudentid("ɾ��");
        if(studentService.isExisit(id)){
            studentService.deleteStudent(id);
            System.out.println("ɾ���ɹ���");
        }
    }

    public final void addStudent() {
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
        //��������
        Student stu = inputStudentinfo(id);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("��ӳɹ���");
        } else {
            System.out.println("���ʧ�ܣ�");
        }
    }

    public final String inputStudentid(String arr){
        String sid;
        while (true){

                System.out.println("������Ҫ" + arr + "��ѧ��ѧ�ţ�");
                sid = sc.next();

                boolean exist = studentService.isExisit(sid);

                if(!exist){
                    System.out.println("ѧ�Ų����ڣ��������ԣ�");
                   break;
                }else {
                    break;
                }
        } return sid;
    }

    public abstract Student inputStudentinfo(String sid);
}
