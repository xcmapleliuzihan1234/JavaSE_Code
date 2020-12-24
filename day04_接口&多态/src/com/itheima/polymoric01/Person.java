package com.itheima.polymoric01;

public class Person {
    public static void main(String[] args) {
        Animal animald = new Dog();
        animald.eat();
        Animal animalc = new Cat();
        animalc.eat();
    }
}
