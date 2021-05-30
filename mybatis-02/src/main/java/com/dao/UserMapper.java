package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author yzze
 * @create 2021-05-29 23:34
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();

    //方法存在多个参数，所有的参数必须加@Param
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user (id, name, pwd) values" +
            "(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name}, pwd=#{pwd} " +
            "where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
