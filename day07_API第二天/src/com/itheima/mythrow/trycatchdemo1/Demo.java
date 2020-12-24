package com.itheima.mythrow.trycatchdemo1;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try{
            arr[3] = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        System.out.println("try下可以执行");
    }
}
