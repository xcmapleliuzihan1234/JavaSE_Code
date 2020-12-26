package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

//库管
public class OtherStudentDao implements BaseStudentDao{
    private static ArrayList<Student> stus = new ArrayList<>();
        static {
            Student stu1 = new Student("计科001","张三","22","1998-10-24");
            Student stu2 = new Student("计科002","李四","22","1998-02-08");
            stus.add(stu1);
            stus.add(stu2);

        }

    public boolean addStudent(Student stu) {
        stus.add(stu);
        return true;

    }

    public Student[] findStudent() {
           /* Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
           Student stu = stus.get(i);
           students[i] = stu;

        }*/
        return stus.toArray(new Student[stus.size()]);
    }

    public void deleteStudent(String id) {
        int index = getIndex(id);
            stus.remove(index);
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i) != null && id != null && stus.get(i).getId().equals(id)) {
                index = i;
            }

        }
        return index;
    }

    public void setStudent(String sid, Student stu) {
        int index = getIndex(sid);
            stus.set(index,stu);

    }
}