package com.xzit.springboot.dao;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Repository
@Order(value = 1)
public class DaoImpl1 implements BaseDao {
}
