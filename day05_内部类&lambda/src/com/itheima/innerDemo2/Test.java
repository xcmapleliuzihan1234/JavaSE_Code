package com.itheima.innerDemo2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //�����ڲ���
        new Animal() {
            @Override
            public void eat() {
                System.out.println("�ԳԳ���");
            }
        }.eat();
    }
}
