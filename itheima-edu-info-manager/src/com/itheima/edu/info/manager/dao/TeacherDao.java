package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] tchs = new Teacher[5];

    static {
        Teacher tch1 = new Teacher("安科001","王五","30","1990-11-11");
        Teacher tch2 = new Teacher("安科002","赵六","29","1991-11-11");
        tchs[0] = tch1;
        tchs[1] = tch2;
    }
    public boolean addTeacher(Teacher tch) {
        int index = -1;
        for (int i = 0; i < tchs.length; i++) {
            if (tchs[i] == null) {
                tchs[i] = tch;
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

    public Teacher[] findAllTeacher() {

        return tchs;
    }

    public void deleteTeacher(String id) {
        int index = getIndex(id);
        tchs[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < tchs.length; i++) {
            if (tchs[i] != null && id != null && tchs[i].getId().equals(id)) {
                index = i;
            }

        }
        return index;
    }

    public void setTeacher(String sid, Teacher tch) {
        int index = getIndex(sid);
        tchs[index] = tch;
    }
}

