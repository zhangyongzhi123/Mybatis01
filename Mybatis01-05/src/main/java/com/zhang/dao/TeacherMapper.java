package com.zhang.dao;

import com.zhang.proj.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    //获取所有老师
    List<Teacher> getAllteacher();

    //获取指定老师负责下的所有学生及老师的信息
    Teacher getAllteacher01(@Param("tid") int id);

}
