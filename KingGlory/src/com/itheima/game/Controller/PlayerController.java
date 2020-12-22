package com.itheima.game.Controller;

import com.itheima.game.Service.PlayerService;
import com.itheima.game.domain.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerController {
    Scanner sc = new Scanner(System.in);
    ArrayList<Player> list = new ArrayList<>();
    PlayerService ps = new PlayerService();

    public void start() {
        lo:
        while (true) {
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
                    System.out.println("�����˳��ٻ�ʦϵͳ");
                    break lo;
                default:
                    System.out.println("������������");
                    break;
            }
        }
    }

    private void alterPlayer() {
        String name = inputPlayername();
        if(ps.isExisit(name)){
            Player player = inputPlayerInfo(name);
            ps.alterPlayer(player,name);
            System.out.println("�޸ĳɹ���");
        }
    }

    private void deletePlayer() {
        String name = inputPlayername();
        if(ps.isExisit(name)){
            ps.deletePlayer(name);
            System.out.println("ɾ���ɹ���");
        }
    }

    private void addPlayer() {
        System.out.println("�������ǳƣ�");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = ps.isExisit(name);
            if (flog) {
                System.out.println("��ǰӢ���Ѵ���,����");
            } else {
                break;
            }
        }
        Player player = inputPlayerInfo(name);
        ps.addPlayer(player);
        System.out.println("��ӳɹ���");
    }

    public Player inputPlayerInfo(String name) {
        System.out.println("�������Ա�");
        String occ = sc.next();
        System.out.println("������ȼ���");
        String price = sc.next();
        System.out.println("�������λ��");
        String type = sc.next();
        Player player = new Player(name, occ, price, type);
        //���
        return player;
    }

    public void findPlayer() {
        list = ps.findPlayer();
        if (list.size() == 0) {
            System.out.println("��ϢΪ�գ�");
        } else {
            System.out.println("�ǳ�\t�Ա�\t�ȼ�\t��λ");
            for (int i = 0; i < list.size(); i++) {
                if (list.size() != 0) {
                    Player player1 = list.get(i);
                    System.out.println(player1.getName() + "\t" + player1.getOcc() + "\t" + player1.getPrice() + "\t" + player1.getType());
                }
            }
        }
    }
    public String inputPlayername(){
        System.out.println("���������ƣ�");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = ps.isExisit(name);
            if (!flog) {
                System.out.println("��ǰ��Ҳ�����,����");
                break;
            } else {
                break;
            }
        }
        return name;
    }
}
