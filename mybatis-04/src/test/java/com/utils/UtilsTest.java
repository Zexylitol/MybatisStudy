package com.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author yzze
 * @create 2021-05-30 18:00
 */
public class UtilsTest {
    @Test
    public void MybatisUtilsTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession);
        sqlSession.close();
    }
}
