package com.dao;

import com.pojo.Student;

import java.util.List;

/**
 * @author yzze
 * @create 2021-05-30 16:42
 */
public interface StudentMapper {
    // 查询所有的学生信息以及对应的老师的信息
    List<Student> getStudent();

    List<Student> getStudent2();
}
