package com.zhang.dao;

import com.zhang.proj.User01;
import com.zhang.ulia.mybatisuliz;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;


class User01MapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
//        List<User01> users = mapper.getUser();
//        for(User01 user:users){
//            System.out.println(users);
//        }

        int i = mapper.update(new User01("2", "许华容", 151451));
        System.out.println(i);
        sqlSession.close();
    }

}