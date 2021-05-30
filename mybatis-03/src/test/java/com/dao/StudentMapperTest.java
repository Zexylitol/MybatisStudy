package com.dao;

import com.pojo.Student;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author yzze
 * @create 2021-05-30 17:13
 */
public class StudentMapperTest {
    @Test
    public void getStudentTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student stu : student) {
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void getStudent2Test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student stu : student) {
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
