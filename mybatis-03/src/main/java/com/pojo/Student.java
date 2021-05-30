package com.pojo;

import lombok.Data;

/**
 * @author yzze
 * @create 2021-05-30 16:38
 */
@Data
public class Student {
    private int id;
    private String name;

    //学生需要关联一个老师
    private Teacher teacher;
}
