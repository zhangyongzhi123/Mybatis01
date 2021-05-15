package com.zhang.dao;

import com.zhang.proj.User01;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import com.zhang.ulia.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User01MapperTest {
    @Test
    public void test(){

        //第一步；获得SqlSession对象
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        //执行SQL.
        //sqlSession.getMapper
        User01Mapper user01Mapper = sqlSession.getMapper(User01Mapper.class);
        List<User01> userList = user01Mapper.getUserList();

        for(User01 user : userList){
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        User01 userById = mapper.getUserById(2);
        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        int i = mapper.addUser(new User01("8", "王五", 85555));
        if(i>0){
            System.out.println(i);
            sqlSession.commit();
        }

        sqlSession.close();
    }

    @Test
    //    使用map插入一个用户,使用map的好处就是当我们修改修改一个用户其中某些属性值的时候，
    //    不用把其他的全部填一遍。因为按照原来的方法，你再修改用户的时候，必须传入一个User类型，
    //    这时在Test类里就必须先new一个带参的User对象。
    public void addUser2(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("zhangid","10");
        map.put("zhangname","曹八");
        map.put("zhangpwd",10);
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updataUser(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        int i = mapper.updataUser(new User01("8","xvharong",20584));
        if(i>0){
            System.out.println(i);
            sqlSession.commit();
        }

        sqlSession.close();
    }

    @Test
    public void DeleteUser(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        User01Mapper mapper = sqlSession.getMapper(User01Mapper.class);
        int i = mapper.deleteUser(1);
        if(i>0){
            System.out.println(i);
            sqlSession.commit();
        }
    }

}