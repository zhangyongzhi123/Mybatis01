package com.zhang.dao;

import com.zhang.proj.User01;
import com.zhang.ulia.mybatisuliz;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


class User01MapperTest {

    static Logger logger = Logger.getLogger(User01MapperTest.class);

    @Test
    public void getUserById(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        //可以作为提示已经成功进入getUserById
        logger.info("info:进入了getUserById");
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        User01 userById = mapper.getUserById(20);
        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User01> userByIndexx = mapper.getUserByIndexx(map);

        for(User01 user:userByIndexx){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void logtest(){
       logger.info("info:进入了testLog4j");
       logger.debug("debug:进入了testLog4j");
       logger.error("error:进入了testLog4j");
    }
}