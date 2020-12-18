package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

//库管
public class StudentDao {
    private Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        //创建数组
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu1 = stus[i];
            if (stu1 == null) {
                stus[i] = stu;
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Student[] findStudent() {
        return stus;
    }

    public void deleteStudent(String id) {
        int index = getIndex(id);
            stus[index] = null;
    }

    private int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && id != null && stus[i].getId().equals(id)) {
                index = i;
            }

        }
        return index;
    }

    public void setStudent(String sid, Student stu) {
        int index = getIndex(sid);
            stus[index] = stu;

    }
}