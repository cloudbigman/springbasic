package com.xzit.springboot.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository(value = "daoImpl3")
public class DaoImpl3 implements BaseDao {
    @PostConstruct
    private void init1(){
        System.out.println("init1");
    }

    @PostConstruct
    private void init2(){
        System.out.println("init2");
    }

    @PreDestroy
    private void destroy1(){
        System.out.println("destroy1");
    }

    @PreDestroy
    private void destroy2(){
        System.out.println("destroy2");
    }
}
