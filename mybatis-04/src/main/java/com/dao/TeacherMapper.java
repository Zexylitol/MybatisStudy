package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yzze
 * @create 2021-05-30 18:05
 */
public interface TeacherMapper {

    // 获取指定老师下的所有学生以及老师的信息
    // 按照结果查询
    Teacher getTeacher(@Param("tid") int id);

    // 按照查询嵌套处理
    Teacher getTeacher2(@Param("tid") int id);
}
