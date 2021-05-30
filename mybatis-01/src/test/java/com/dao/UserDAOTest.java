package com.dao;

import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yzze
 * @create 2021-05-29 18:03
 */
public class UserDAOTest {

    static Logger logger = Logger.getLogger(UserDAOTest.class);

    @Test
    public void testLog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }

    @Test
    public void getUserListTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
        List<User> userList = userDAO.getUserList();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        sqlSession.close();
    }

    @Test
    public void getUserByIdTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        mapper.addUser(new User(4,"hou","123456"));

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        mapper.updateUser(new User(4,"hou","123"));

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        mapper.deleteUser(5);

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id1",5);
        map.put("name1","dong");
        map.put("pwd1","12345");
        mapper.addUser2(map);

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void getUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("helloid",5);
        map.put("name","dong");
        User user = mapper.getUserById2(map);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        List<User> list = mapper.getUserLike("o");

        for(User user : list){
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void judge() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        System.out.println(sqlSession == sqlSession1);  // false
    }

    @Test
    public void getByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> userList = mapper.getUserByLimit(map);

        for(User user:userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}