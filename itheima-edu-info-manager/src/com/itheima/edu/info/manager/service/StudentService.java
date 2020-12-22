package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.StudentDaoFactory;

//ҵ��Ա

public class StudentService {
    BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();

    //���ѧ��
    public boolean addStudent(Student stu) {

        return studentDao.addStudent(stu);
    }

    public void deleteStudent(String id) {
       studentDao.deleteStudent(id);
    }
    //�鿴ѧ��
    public Student[] findStudent() {
        Student[] stus = studentDao.findStudent();
        boolean flag = false;
        //���ж��Ƿ�Ϊȫ��
        for (int i = 0; i < stus.length; i++) {
            if(stus[i]!=null){
                flag = true;
            }
        }if(flag == false){
            return null;
        }else {
            return stus;
        }

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

    public void setStudent(String sid,Student stu) {
        studentDao.setStudent(sid,stu);
    }
}
