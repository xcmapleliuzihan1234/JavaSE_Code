package com.itheima.IntegerDemo;

public class Test {
    public static void main(String[] args) {
        String i = "100";
        //ת��Ϊint
        int j = Integer.parseInt(i);
        System.out.println(j + 100);
        //ת����String
        //1
       String s =  j + "";
        System.out.println(s + 100);
      //2
        String s1 = String.valueOf(j);
        System.out.println(s1 + 100);
    }
}
