package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author yzze
 * @create 2021-05-30 20:14
 */
public interface BlogMapper {
    // 插入数据
    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    // 更新博客
    int updateBlogChoose(Map map);

    int updateBlogSet(Map map);
}
