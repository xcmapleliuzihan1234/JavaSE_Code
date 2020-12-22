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
            // 1. 搭建主界面菜单
            System.out.println("--------欢迎来到王者荣耀--------");
            System.out.println("1 添加召唤师  2 删除召唤师  3 修改召唤师  4 查看召唤师  5 退出");
            System.out.println("请输入您的选择:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加英雄");
                    addPlayer();
                    break;
                case "2":
                    // System.out.println("删除英雄");
                    deletePlayer();
                    break;
                case "3":
                    // System.out.println("修改英雄");
                    alterPlayer();
                    break;
                case "4":
                    // System.out.println("查看英雄");
                    findPlayer();
                    break;
                case "5":
                    System.out.println("您已退出召唤师系统");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

    private void alterPlayer() {
        String name = inputPlayername();
        if(ps.isExisit(name)){
            Player player = inputPlayerInfo(name);
            ps.alterPlayer(player,name);
            System.out.println("修改成功！");
        }
    }

    private void deletePlayer() {
        String name = inputPlayername();
        if(ps.isExisit(name)){
            ps.deletePlayer(name);
            System.out.println("删除成功！");
        }
    }

    private void addPlayer() {
        System.out.println("请输入昵称：");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = ps.isExisit(name);
            if (flog) {
                System.out.println("当前英雄已存在,请检查");
            } else {
                break;
            }
        }
        Player player = inputPlayerInfo(name);
        ps.addPlayer(player);
        System.out.println("添加成功！");
    }

    public Player inputPlayerInfo(String name) {
        System.out.println("请输入性别：");
        String occ = sc.next();
        System.out.println("请输入等级：");
        String price = sc.next();
        System.out.println("请输入段位：");
        String type = sc.next();
        Player player = new Player(name, occ, price, type);
        //添加
        return player;
    }

    public void findPlayer() {
        list = ps.findPlayer();
        if (list.size() == 0) {
            System.out.println("信息为空！");
        } else {
            System.out.println("昵称\t性别\t等级\t段位");
            for (int i = 0; i < list.size(); i++) {
                if (list.size() != 0) {
                    Player player1 = list.get(i);
                    System.out.println(player1.getName() + "\t" + player1.getOcc() + "\t" + player1.getPrice() + "\t" + player1.getType());
                }
            }
        }
    }
    public String inputPlayername(){
        System.out.println("请输入名称：");
        String name;
        while (true) {
            name = sc.next();
            boolean flog = ps.isExisit(name);
            if (!flog) {
                System.out.println("当前玩家不存在,请检查");
                break;
            } else {
                break;
            }
        }
        return name;
    }
}
