package com.pojo;


import lombok.Data;
import java.util.List;

/**
 * @author yzze
 * @create 2021-05-30 18:03
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> studentList;
}
