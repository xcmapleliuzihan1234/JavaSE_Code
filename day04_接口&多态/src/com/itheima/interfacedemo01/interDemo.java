package com.itheima.interfacedemo01;

public interface interDemo {
     default void eat(){
        drink();
    }
    private void drink(){
        System.out.println("���̲�");
    }
    private static void sleep(){
        System.out.println("˯����");
    }
    static void shui(){
        sleep();
    }
}
