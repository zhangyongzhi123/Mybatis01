package com.zhang.dao;

import com.zhang.proj.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师信息
    List<Student> getStudent();
}
