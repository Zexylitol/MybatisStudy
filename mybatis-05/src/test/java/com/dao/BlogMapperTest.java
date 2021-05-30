package com.dao;

import com.pojo.Blog;
import com.utils.IDUtils;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yzze
 * @create 2021-05-30 20:32
 */
public class BlogMapperTest {
    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setAuthor("one");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        blog.setTitle("first");

        blogMapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("second");
        blogMapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("third");
        blogMapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("forth");
        blogMapper.addBlog(blog);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void queryBlogIFTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();

        //        map.put("title", "second");
        //map.put("author", "one");

        List<Blog> list = blogMapper.queryBlogIF(map);

        for (Blog blog : list) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlogSetTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();

        map.put("title", "java");
        //map.put("author", "one");
        map.put("id", "42244ca5eafd42c8ad30c4c2e256417e");

        int i = blogMapper.updateBlogSet(map);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();

        map.put("title", "java");
        //map.put("author", "one");
        map.put("views", 999);

        blogMapper.queryBlogChoose(map);

        sqlSession.close();
    }
}
