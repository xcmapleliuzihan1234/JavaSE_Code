package com.itheima.mathdemo;

public class MathDemo {
    public static void main(String[] args) {
        double abs = Math.abs(-3.14);
        System.out.println(abs);

        double ceil = Math.ceil(3.45);
        System.out.println(ceil);

        double floor = Math.floor(3.99);
        System.out.println(floor);

        long round = Math.round(5.45);
        System.out.println(round);

        int max = Math.max(10, 20);
        System.out.println(max);

        int min = Math.min(10, 20);
        System.out.println(min);

        double pow = Math.pow(3, 3);
        System.out.println(pow);

        int  random = ((int)((Math.random())*100)+1);
        System.out.println(random);

    }
}
