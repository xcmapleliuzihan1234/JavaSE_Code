package com.itheima.systemdemo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[10];

        System.arraycopy(arr1,0,arr2,arr2.length-3,3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
