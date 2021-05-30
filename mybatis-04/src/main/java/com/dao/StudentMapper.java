package com.dao;

import com.pojo.Student;

/**
 * @author yzze
 * @create 2021-05-30 18:04
 */
public interface StudentMapper {

    Student getStudentByTeacherId(int id);
}
