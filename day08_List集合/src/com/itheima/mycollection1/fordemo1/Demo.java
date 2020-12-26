package com.itheima.mycollection1.fordemo1;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for(String s : list){
            System.out.print(s + " ");
        }
    }
}
