package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

//业务员

public class StudentService {
    StudentDao studentDao = new StudentDao();

    //添加学生
    public boolean addStudent(Student stu) {

        return studentDao.addStudent(stu);
    }

    public void deleteStudent() {

    }

    public void setStudent() {

    }

    //查看学生
    public Student[] findStudent() {
        Student[] stus = studentDao.findStudent();

        return stus;
    }

    public boolean isExisit(String id) {
        Student[] stus = studentDao.findStudent();
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && stus[i].getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
