package com.itheima.mycollection1.collectionmethod;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("柳岩");
        collection.add("杨幂");
        collection.add("迪丽热巴");
        collection.add("古力娜扎");
        collection.add("马尔扎哈");

        method4(collection);//判断是否包含指定元素，是则返回ture,否则返回false

        method1(collection);//删除指定元素

        method2(collection);//删除指定条件的元素

        method6(collection);//判断集合是否为空

        method5(collection);//返回集合长度

        method3(collection);//删除全部元素



    }

    private static void method6(Collection<String> collection) {
        boolean empty1 = collection.isEmpty();
        if(empty1){
            System.out.println("空");
        }else {
            System.out.println("不为空");
        }

    }

    private static void method5(Collection<String> collection) {
        int size = collection.size();
        System.out.println("还有" + size + "个人");
    }

    private static void method4(Collection<String> collection) {
        boolean b1 = collection.contains("古力娜扎");
        if(b1){
            System.out.println("存在");
        }

    }

    private static void method3(Collection<String> collection) {
        collection.clear();
        System.out.println(collection);
    }

    private static void method2(Collection<String> collection) {
        collection.removeIf(
                (String i)->{
                   return i.length() > 2;
                });
        System.out.println("已删除长度大于2的人名");
    }

    private static void method1(Collection<String> collection) {
        collection.remove("马尔扎哈");
        System.out.println("已删除马尔扎哈");
    }
}
