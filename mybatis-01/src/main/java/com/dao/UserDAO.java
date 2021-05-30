package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author yzze
 * @create 2021-05-29 18:01
 */
public interface UserDAO {
    /**
     * 查询全部用户
     * @return
     */
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 插入用户
     * @param user
     */
    void addUser(User user);

    //修改用户
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);

    List<User> getUserLike(String value);

    /**
     * 万能Map
     * Map传递参数，直接在sql中取出key即可
     * 对象传递参数，直接在sql中取对象的属性即可
     */
    int addUser2(Map<String, Object> map);
    User getUserById2(Map<String, Object> map);

    /**
     * 分页查询
     * 减少数据量
     * @param map
     * @return
     */
    List<User> getUserByLimit(Map<String, Integer> map);
}
