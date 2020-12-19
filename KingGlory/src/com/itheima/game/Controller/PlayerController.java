package com.itheima.game.Controller;

import com.itheima.game.Service.PlayerService;

import java.util.Scanner;

public class PlayerController {
    Scanner sc = new Scanner(System.in);

    PlayerService ps = new PlayerService();

    public void start() {
        lo :while (true) {
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
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("您的输入有误");
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
