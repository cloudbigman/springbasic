package com.xzit.springboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import java.beans.PropertyDescriptor;

public class MyBeanProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    //实例化之前
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("- 执行了实例化Bean对象之前的InstantiationAwareBeanPostProcessorAdapter接口的postProcessBeforeInstantiation方法");
        return null;
    }
    //实例化之后
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("- 执行了实例化Bean对象之后的InstantiationAwareBeanPostProcessorAdapter接口的postProcessAfterInstantiation方法");
        return true;
    }
    //Bean设置属性
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("- 执行了在Bean设置属性时的InstantiationAwareBeanPostProcessorAdapter接口的postProcessPropertyValues方法，设置pvs值=" + pvs);
        return pvs;
    }
    //初始化之前
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Student student = (Student) bean;
        System.out.println("- 执行了初始化Bean对象之前的InstantiationAwareBeanPostProcessorAdapter接口的postProcessBeforeInitialization方法");
        student.setName("李四");
        return bean;
    }
    //初始化之后
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Student student = (Student) bean;
        System.out.println("- 执行了初始化Bean对象之后的InstantiationAwareBeanPostProcessorAdapter接口的postProcessAfterInitialization方法");
        student.setAge(10);
        return bean;
    }
}
