package com.itheima.mythrow.homework;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        if (age >= 23 || age <= 18) {
           throw  new AgeOutOfBoundsException("年龄不正确");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 23 && age >= 18) {
            this.age = age;
        } else {
          throw   new AgeOutOfBoundsException("年龄不正确");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
