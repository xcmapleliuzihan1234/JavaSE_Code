package com.itheima.ตÝน้;

public class Test {
    public static void main(String[] args) {
        int num = getSum(100);
        System.out.println(num);
    }

    private static int getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);
        }

    }
}
