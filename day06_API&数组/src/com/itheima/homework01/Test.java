package com.itheima.homework01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee e1 = new Employee("张三", 23);
        Employee e2 = new Employee("李四", 24);
        Employee e3 = new Employee("张三", 23);
        Employee e4 = new Employee("张三", 28);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            boolean flag = false;
            for (int j = 0; j < list.size(); j++) {
                Employee emp1 = list.get(j);
                if (emp != emp1 && emp.equals(emp1)) {
                    flag = true;
                }
            }if(flag){
                System.out.println(emp.toString() + "获得幸运大礼包");
            }else {
                System.out.println(emp.toString() + "获得普通大礼包");
            }

        }

    }
}
