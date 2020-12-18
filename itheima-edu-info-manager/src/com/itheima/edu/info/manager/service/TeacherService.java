package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    TeacherDao td = new TeacherDao();

    public boolean addTeacher(Teacher tch) {
        boolean res = td.addTeacher(tch);
        return res;
    }

    public boolean isExisit(String id) {
        Teacher[] stus = td.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && stus[i].getId().equals(id)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public  Teacher[] findAllTeacher() {
        Teacher[] tchs = td.findAllTeacher();
        boolean flag = false;
        //先判断是否为全空
        for (int i = 0; i < tchs.length; i++) {
            if(tchs[i]!=null){
                flag = true;
            }
        }if(flag == false){
            return null;
        }else {
            return tchs;
        }
    }

    public void deleteStudent(String id) {
        td.deleteTeacher(id);
    }

    public void setTeacher(String sid, Teacher tch) {
        td.setTeacher(sid,tch);
    }
}
