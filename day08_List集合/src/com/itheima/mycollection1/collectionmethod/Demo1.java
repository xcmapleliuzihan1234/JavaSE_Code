package com.itheima.mycollection1.collectionmethod;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("����");
        collection.add("����");
        collection.add("�����Ȱ�");
        collection.add("��������");
        collection.add("�������");

        method4(collection);//�ж��Ƿ����ָ��Ԫ�أ����򷵻�ture,���򷵻�false

        method1(collection);//ɾ��ָ��Ԫ��

        method2(collection);//ɾ��ָ��������Ԫ��

        method6(collection);//�жϼ����Ƿ�Ϊ��

        method5(collection);//���ؼ��ϳ���

        method3(collection);//ɾ��ȫ��Ԫ��



    }

    private static void method6(Collection<String> collection) {
        boolean empty1 = collection.isEmpty();
        if(empty1){
            System.out.println("��");
        }else {
            System.out.println("��Ϊ��");
        }

    }

    private static void method5(Collection<String> collection) {
        int size = collection.size();
        System.out.println("����" + size + "����");
    }

    private static void method4(Collection<String> collection) {
        boolean b1 = collection.contains("��������");
        if(b1){
            System.out.println("����");
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
        System.out.println("��ɾ�����ȴ���2������");
    }

    private static void method1(Collection<String> collection) {
        collection.remove("�������");
        System.out.println("��ɾ���������");
    }
}
