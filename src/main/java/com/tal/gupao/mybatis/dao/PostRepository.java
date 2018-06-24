package com.tal.gupao.mybatis.dao;

import com.tal.gupao.mybatis.dao.bean.Post;
import com.tal.gupao.mybatis.mapper.PostMapper;
import org.apache.ibatis.session.SqlSession;

public class PostRepository {

    public static void main(String[] args) {
        SqlSession sqlSession = HSqlSessionFactory.getSqlSession();
        PostMapper post = sqlSession.getMapper(PostMapper.class);
        Post post1 = post.selectByPrimaryKey(1);
        System.out.println(post1.getBlog());
        System.out.println((int)(Math.random()*2));
    }
}
