package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.OtherStuderController;
import com.itheima.edu.info.manager.controller.StuderController;
import com.itheima.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

//�������
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //�˵��
        while (true){
            System.out.println("--------��ӭ����������Ϣ����ϵͳ--------");
            System.out.println("����������ѡ��: 1.ѧ������  2.��ʦ����  3.�˳�");

            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                   // ����ѧ������ϵͳ
                    OtherStuderController studerController = new OtherStuderController();
                    studerController.start();
                    break;
                case 2 :
                  //  ������ʦ����ϵͳ
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case 3 :
                    System.out.println("��л����ʹ�ã�");
                    System.exit(0);
                default:
                    System.out.println();
                    break;
            }
        }

    }
}
