package com.itheima.game.Controller;

import com.itheima.game.Service.HeroService;
import com.itheima.game.domain.Hero;

import java.util.ArrayList;
import java.util.Scanner;

public class HeroController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        lo :while (true) {
            // 1. �������˵�
            System.out.println("--------��ӭ����������ҫ--------");
            System.out.println("1 ���Ӣ��  2 ɾ��Ӣ��  3 �޸�Ӣ��  4 �鿴Ӣ��  5 �˳�");
            System.out.println("����������ѡ��:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("���Ӣ��");
                    addHero();
                    break;
                case "2":
                    // System.out.println("ɾ��Ӣ��");
                   removeHero();
                    break;
                case "3":
                    // System.out.println("�޸�Ӣ��");
                  setHero();
                    break;
                case "4":
                    // System.out.println("�鿴Ӣ��");
                    getHero();
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

    public void setHero() {
        String name = inputHeroname();
        if(hs.isExisit(name)){
            Hero hero = inputHeroInfo(name);
            hs.setHero(hero,name);
            System.out.println("�޸ĳɹ���");
        }
    }

    public void removeHero() {
       String name = inputHeroname();
       if(hs.isExisit(name)){
           hs.removeHero(name);
           System.out.println("ɾ���ɹ���");
       }
    }

    ArrayList<Hero> list = new ArrayList<>();
    public void getHero() {
       list = hs.getHero();
       if (list.size()==0){
           System.out.println("��ϢΪ�գ�");
       }else {
           System.out.println("Ӣ��\tְҵ\t�۸�\t����");
           for (int i = 0; i < list.size(); i++) {
               if(list.size()!=0){
                   Hero hero1 = list.get(i);
                   System.out.println( hero1.getName() + "\t" + hero1.getOcc() + "\t" + hero1.getPrice() + "\t" + hero1.getType());
               }
           }
       }


    }

    Scanner sc = new Scanner(System.in);
    HeroService hs = new HeroService();

    public void addHero() {
        System.out.println("���������ƣ�");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = hs.isExisit(name);
            if (flog) {
                System.out.println("��ǰӢ���Ѵ���,����");
            } else {
                break;
            }
        }
        Hero hero = inputHeroInfo(name);
            hs.addHero(hero);
            System.out.println("��ӳɹ���");
    }
    public String inputHeroname(){
        System.out.println("���������ƣ�");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = hs.isExisit(name);
            if (!flog) {
                System.out.println("��ǰӢ�۲�����,����");
                break;
            } else {
                break;
            }
        }
        return name;
    }
    public Hero inputHeroInfo(String name){
        System.out.println("������ְҵ��");
        String occ = sc.next();
        System.out.println("������۸�");
        String price = sc.next();
        System.out.println("���������ͣ�");
        String type = sc.next();
        Hero hero = new Hero(name,occ,price,type);
        //���
       return hero;

    }
}
