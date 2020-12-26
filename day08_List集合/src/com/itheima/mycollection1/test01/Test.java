package com.itheima.mycollection1.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("小刘",23);
        Student stu2 = new Student("小韩",24);
        Student stu3 = new Student("小创",25);

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
