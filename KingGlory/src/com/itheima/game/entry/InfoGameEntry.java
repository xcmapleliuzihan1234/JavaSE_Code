package com.itheima.game.entry;

import com.itheima.game.Controller.HeroController;
import com.itheima.game.Controller.PlayerController;

import java.util.Scanner;

public class InfoGameEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("--------��ӭ����������ҫ--------");
            System.out.println("����������ѡ��: 1.Ӣ��  2.�ٻ�ʦ  3.�˳�");
            int num = sc.nextInt();
            switch (num){
                case 1 :
                    HeroController hc = new HeroController();
                    hc.start();
                    break;
                case 2 :
                    PlayerController pc = new PlayerController();
                    pc.start();
                    break;
                case 3 :
                    System.exit(0);
                    default:
                        System.out.println("������������");
            }
        }

    }

}
