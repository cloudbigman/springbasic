package com.xzit.springboot.service;

import com.xzit.springboot.Teacher;
import com.xzit.springboot.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private TeacherDao teacherDao;

    /**
     * 标注方法，这里会自动将 LogDao 传给方法入参。
     * @param teacherDao
     */
    @Lazy
    @Autowired
    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    //通过工号查询教师信息
    public Teacher findByTwno(String twno){
        return teacherDao.findByTwno(twno);
    }
}
