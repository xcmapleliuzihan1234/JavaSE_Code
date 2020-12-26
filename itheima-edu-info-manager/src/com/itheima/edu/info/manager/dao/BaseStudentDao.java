package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public interface  BaseStudentDao {
    public abstract boolean addStudent(Student stu) ;

    public abstract Student[] findStudent();

    public abstract void deleteStudent(String id) ;

    public abstract int getIndex(String id);

    public abstract void setStudent(String sid, Student stu);

}
