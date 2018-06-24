package com.tal.gupao.mybatis.dao;

import com.tal.gupao.mybatis.dao.bean.Blog;
import com.tal.gupao.mybatis.mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;

public class BlogRepository {

    public static void main(String[] args) {
        SqlSession sqlSession = HSqlSessionFactory.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = blogMapper.selectByPrimaryKey(1);
        System.out.println(blog);
    }
}
