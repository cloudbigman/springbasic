package com.xzit.springboot;

import com.xzit.springboot.dao.BaseDao;
import com.xzit.springboot.dao.MyOperation;
import com.xzit.springboot.dao.TeacherDao;
import com.xzit.springboot.service.TeacherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    @Test
    public void getDepartment(){
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        //2.通过 id 值获取对象
        /*Department department1 = (Department) applicationContext.getBean("department1");
        System.out.println(department1);

        Department department2 = (Department) applicationContext.getBean("department2");
        System.out.println(department2);*/

        Teacher teacher1 = (Teacher)applicationContext.getBean("teacher1");
        System.out.println(teacher1);

    }

    @Test
    public void beanLycyle(){
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans2.xml");
        //2.通过 id 值获取对象
        Student student = (Student)applicationContext.getBean("student");
        student.show();
    }

    @Test
    public void componentAnno(){
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans3.xml");
        //2.通过 id 值获取对象
        TeacherDao  teacherDao = (TeacherDao)applicationContext.getBean("teacherDao");
        teacherDao.findByTwno("xzit1007");
    }

    @Test
    public void autowiredAnno(){
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans3.xml");
        //2.通过 id 值获取对象
        TeacherService teacherService = (TeacherService)applicationContext.getBean(TeacherService.class);
        teacherService.findByTwno("xzit1007");
    }

    @Test
    public void collectionsAutowiredAnno(){
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans3.xml");
        //2.通过 id 值获取对象
        MyOperation myOperation = (MyOperation)applicationContext.getBean("myOperation");
        System.out.println(myOperation.getPlugins());
        System.out.println(myOperation.getPluginMap());
    }

    @Test
    public void postConstructAnno(){
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans3.xml");
        //2.通过 id 值获取对象
        BaseDao baseDao = (BaseDao)applicationContext.getBean("daoImpl3");
        //3.bean销毁
        ((ClassPathXmlApplicationContext) applicationContext).destroy();
    }

}
