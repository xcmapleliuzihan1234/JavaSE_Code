package com.itheima.polymorpic02;

 interface Animal {
    void eat();
}
class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("≥‘»‚");
    }
}
class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("≥‘”„");
    }
}
public class Test{
    public static void main(String[] args) {
         getAnimal().eat();

    }
    public static Animal getAnimal(){
        return new Cat();
    }

}