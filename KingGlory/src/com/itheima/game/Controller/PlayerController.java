package com.itheima.game.Controller;

import com.itheima.game.Service.PlayerService;

import java.util.Scanner;

public class PlayerController {
    Scanner sc = new Scanner(System.in);

    PlayerService ps = new PlayerService();

    public void start() {
        lo :while (true) {
            // 1. �������˵�
            System.out.println("--------��ӭ����������ҫ--------");
            System.out.println("1 ����ٻ�ʦ  2 ɾ���ٻ�ʦ  3 �޸��ٻ�ʦ  4 �鿴�ٻ�ʦ  5 �˳�");
            System.out.println("����������ѡ��:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("���Ӣ��");
                    addPlayer();
                    break;
                case "2":
                    // System.out.println("ɾ��Ӣ��");
                    deletePlayer();
                    break;
                case "3":
                    // System.out.println("�޸�Ӣ��");
                   alterPlayer();
                    break;
                case "4":
                    // System.out.println("�鿴Ӣ��");
                   findPlayer();
                    break;
                case "5":
                    System.out.println("�˳�");
                    break lo;
                default:
                    System.out.println("������������");
                    break;
            }
        }
    }

    private void alterPlayer() {

    }

    private void deletePlayer() {

    }

    private void addPlayer() {
        ps.addPlayer();
    }

    public void findPlayer() {

    }
}
