package com.itheima.extendsDemo02;

public class Zi extends Fu {
    public void show(){
        System.out.println("zi..show..");
    }

    public void methed() {
        show();
        super.show();
    }
}
