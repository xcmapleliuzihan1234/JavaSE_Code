package com.itheima.mycollection1.iterator1;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("����");
        list.add("����");
        list.add("�����Ȱ�");
        list.add("��������");
        list.add("�������");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if("�������".equals(s)){
             //   list.remove("�������");����д�������ܸı伯�ϳ���
                it.remove();//ʹ�õ�����ɾ�������ô���
            }
        }
        System.out.println(list);
    }
}
