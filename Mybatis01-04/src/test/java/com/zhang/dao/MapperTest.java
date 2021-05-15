package com.zhang.dao;

import com.zhang.proj.Student;
import com.zhang.ulia.mybatisuliz;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MapperTest {

    @Test
    public void getAllStudentinfo(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}
