package com.itheima.extendsDemo01;

public class Zi extends Fu {
    int a = 20;
    public   void methed(){
        int a = 30;
        System.out.println("������" + a);
        System.out.println("���ࣺ" + this.a);
        System.out.println("���ࣺ" + super.a);

        Ye ye = new Ye();
        System.out.println("����ĸ��ࣺ" + ye.a);

    }
}
