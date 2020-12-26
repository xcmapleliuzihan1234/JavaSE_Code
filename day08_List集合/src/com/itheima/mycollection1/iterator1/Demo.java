package com.itheima.mycollection1.iterator1;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("柳岩");
        list.add("杨幂");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if("马尔扎哈".equals(s)){
             //   list.remove("马尔扎哈");错误写法，不能改变集合长度
                it.remove();//使用迭代器删除，不用传参
            }
        }
        System.out.println(list);
    }
}
