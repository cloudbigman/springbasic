package com.xzit.springboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Student implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean {
    private String name;
    private int age;

    //无参构造
    public Student() {
        System.out.println("- 执行了无参构造");
    }
    //有参构造
    public Student(String name, int age) {
        System.out.println("- 执行了有参构造name=" + name + " age=" + age);
        this.name = name;
        this.age = age;
    }
    //get、set方法
    public String getName() {
        System.out.println("- 执行了getName()方法");
        return name;
    }
    public void setName(String name) {
        System.out.println("- 执行了setName()方法,调用了setter方法通过有参构造完成了属性注入，name=" + name);
        this.name = name;
    }
    public int getAge() {
        System.out.println("- 执行了getAge()方法");
        return age;
    }
    public void setAge(int age) {
        System.out.println("- 执行了setAge()方法,调用了setter方法通过有参构造完成了属性注入，age=" + age);
        this.age = age;
    }
    //已定义show()方法
    public void show() {
        System.out.println("- 执行了自定义的show()方法，name=" + name);
    }
    //自定义初始化对象方法init()
    public void init() {
        System.out.println("- 执行了自定义的初始化对象方法init()");
    }
    //自定义销毁对象方法des()
    public void des() {
        System.out.println("- 执行了自定义的销毁对象方法des()");
    }
    //实现BeanNameAware接口，重写setBeanName()方法
    @Override
    public void setBeanName(String beanName) {
        System.out.println("- 执行了BeanNameAware接口的setBeanName()方法，将bean的id暴露出来，当前对象在容器中的beanid=" + beanName);
    }
    //实现BeanFactoryAware接口，重写setBeanFactory()方法
    @Override
    public void setBeanFactory(BeanFactory factory) throws BeansException {
        System.out.println("- 执行了BeanFactoryAware接口的setBeanFactory()方法，将工厂对象暴露出来，通过该工厂可以获取容器中的对象");
        System.out.print("this==factory.getBean(“student”)的值=");
        System.out.println(this==factory.getBean("student"));
    }
    //实现InitializingBean接口，重写afterPropertiesSet()方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("- 执行了InitializingBean接口的afterPropertiesSet()方法，初始化完成，完成了属性的注入，name = " + name);
    }
    //实现DisposableBean接口，重写destroy()方法
    @Override
    public void destroy() throws Exception {
        System.out.println("- 执行了DisposableBean接口的destroy()方法，容器被关闭，对象即将被销毁，执行Spring自带的销毁方法");
    }
}