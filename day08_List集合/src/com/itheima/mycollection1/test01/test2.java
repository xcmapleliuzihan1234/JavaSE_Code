package com.itheima.mycollection1.test01;

import java.util.Iterator;
import java.util.LinkedList;

public class test2 {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        Student stu1 = new Student("С��",23);
        Student stu2 = new Student("С��",24);
        Student stu3 = new Student("С��",25);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------");

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
