package com.zhang.dao;

import com.zhang.proj.Student;
import com.zhang.proj.Teacher;
import com.zhang.ulia.mybatisuliz;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MapperTest02 {

    @Test
    public void Getteacher(){
        SqlSession sqlSession = mybatisuliz.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher allteacher01 = mapper.getAllteacher01(1);
        System.out.println(allteacher01);
        sqlSession.close();
    }


}
