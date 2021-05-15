package com.zhang.dao;

import java.util.List;
import java.util.Map;

import com.zhang.proj.User01;

public interface User01Mapper {
    //查询全部用户
    List<User01> getUserList() ;

    //根据ID查询用户
    User01 getUserById(int id);

    //插入一个用户
    int addUser(User01 user);

//    使用map插入一个用户,使用map的好处就是当我们修改修改一个用户其中某些属性值的时候，
//    不用把其他的全部填一遍。因为按照原来的方法，你再修改用户的时候，必须传入一个User类型，
//    这时在Test类里就必须先new一个带参的User对象。
    int addUser2(Map<String,Object> map);

    //修改用户
    int updataUser(User01 user);

    //删除一个用户
    int deleteUser(int id);
}
