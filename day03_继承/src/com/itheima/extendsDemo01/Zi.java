package com.itheima.extendsDemo01;

public class Zi extends Fu {
    int a = 20;
    public   void methed(){
        int a = 30;
        System.out.println("方法：" + a);
        System.out.println("子类：" + this.a);
        System.out.println("父类：" + super.a);

        Ye ye = new Ye();
        System.out.println("父类的父类：" + ye.a);

    }
}
