package com.itheima.interfacedemo01;

public interface interDemo {
     default void eat(){
        drink();
    }
    private void drink(){
        System.out.println("哉通画");
    }
    private static void sleep(){
        System.out.println("鋒状状");
    }
    static void shui(){
        sleep();
    }
}
