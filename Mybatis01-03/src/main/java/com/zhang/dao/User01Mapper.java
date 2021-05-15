package com.zhang.dao;

import com.zhang.proj.User01;
import org.apache.ibatis.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface User01Mapper {

    @Select("select * from db3.zhang")
    List<User01> getUser();

    @Select("select * from db3.zhang where id = #{id}")
    User01 getUserById(@Param("id") int id);

    @Insert("insert into db3.zhang(id,name,pwd) value (#{id},#{name},#{password})")
    int addUser(User01 user);

    @Update("update db3.zhang set name=#{name},pwd=#{pwd} where id = #{id}")
    int update(User01 user);

    @Delete("delete from db3.zhang where id = #{zhangID}")
    int deleteUser(@Param("zhangID") int id);

}
