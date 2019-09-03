package com.xzit.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MyOperation {
    /**
     * 把所有类型为 BaseDao 的 Bean 都注入这个 List
     */
    @Autowired(required = false)
    private List<BaseDao> baseDaos;

    /**
     * 把所有类型为 BaseDao 的 Bean 都注入这个 Map
     * key：Bean 名称；value：所有实现了 BaseDao 接口的 Bean
     */
    @Autowired
    private Map<String, BaseDao> baseDaoMap;

    public List<BaseDao> getPlugins() {
        return baseDaos;
    }

    public Map<String, BaseDao> getPluginMap() {
        return baseDaoMap;
    }
}
