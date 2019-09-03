package com.xzit.springboot.dao;

import com.xzit.springboot.Teacher;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Lazy
@Repository
public class TeacherDao {
    //通过工号查询教师信息
    public Teacher findByTwno(String twno){
        System.out.println("通过工号(" + twno + ")查询教师信息");
        return null;
    }
}
