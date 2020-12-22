package com.itheima.innerDemo2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //匿名内部类
        new Animal() {
            @Override
            public void eat() {
                System.out.println("吃吃吃肉");
            }
        }.eat();
    }
}
