package com.itheima.lambda01;

public class Test {
    public static void main(String[] args) {
        method(() ->{
            System.out.println("��Ӿ");
        });
    }
    public static void method(Swimming swimming){
        swimming.swim();
    }
}
