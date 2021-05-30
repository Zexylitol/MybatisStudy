package com.dao;

import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author yzze
 * @create 2021-05-30 16:43
 */
public class UtilsTest {
    @Test
    public void MybatisYtilsTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession);
        sqlSession.close();
    }
}
