package com.zhang.dao;

import com.zhang.proj.User01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface User01Mapper {

    //根据ID查询用户
    User01 getUserById(int id);

    List<User01> getUserByIndexx(Map<String,Integer> map);

}
