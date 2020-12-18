package com.itheima.game.Controller;

import com.itheima.game.Service.HeroService;
import com.itheima.game.domain.Hero;

import java.util.ArrayList;
import java.util.Scanner;

public class HeroController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        lo :while (true) {
            // 1. 搭建主界面菜单
            System.out.println("--------欢迎来到王者荣耀--------");
            System.out.println("1 添加英雄  2 删除英雄  3 修改英雄  4 查看英雄  5 退出");
            System.out.println("请输入您的选择:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加英雄");
                    addHero();
                    break;
                case "2":
                    // System.out.println("删除英雄");
                   removeHero();
                    break;
                case "3":
                    // System.out.println("修改英雄");
                  setHero();
                    break;
                case "4":
                    // System.out.println("查看英雄");
                    getHero();
                    break;
                case "5":
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

    public void setHero() {
        String name = inputHeroname();
        if(hs.isExisit(name)){
            Hero hero = inputHeroInfo(name);
            hs.setHero(hero,name);
            System.out.println("修改成功！");
        }
    }

    public void removeHero() {
       String name = inputHeroname();
       if(hs.isExisit(name)){
           hs.removeHero(name);
           System.out.println("删除成功！");
       }
    }

    ArrayList<Hero> list = new ArrayList<>();
    public void getHero() {
       list = hs.getHero();
       if (list.size()==0){
           System.out.println("信息为空！");
       }else {
           System.out.println("英雄\t职业\t价格\t类型");
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
        System.out.println("请输入名称：");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = hs.isExisit(name);
            if (flog) {
                System.out.println("当前英雄已存在,请检查");
            } else {
                break;
            }
        }
        Hero hero = inputHeroInfo(name);
            hs.addHero(hero);
            System.out.println("添加成功！");
    }
    public String inputHeroname(){
        System.out.println("请输入名称：");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = hs.isExisit(name);
            if (!flog) {
                System.out.println("当前英雄不存在,请检查");
                break;
            } else {
                break;
            }
        }
        return name;
    }
    public Hero inputHeroInfo(String name){
        System.out.println("请输入职业：");
        String occ = sc.next();
        System.out.println("请输入价格：");
        String price = sc.next();
        System.out.println("请输入类型：");
        String type = sc.next();
        Hero hero = new Hero(name,occ,price,type);
        //添加
       return hero;

    }
}
