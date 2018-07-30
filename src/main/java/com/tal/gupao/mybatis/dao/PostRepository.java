package com.tal.gupao.mybatis.dao;

import com.tal.gupao.mybatis.dao.bean.Author;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class PostRepository {

    public static void main(String[] args) {
//        SqlSession sqlSession = HSqlSessionFactory.getSqlSession();
//        PostMapper post = sqlSession.getMapper(PostMapper.class);
//        Post post1 = post.selectByPrimaryKey(1);
//        System.out.println(post1.getBlog());
        System.out.println((int)(Math.random()*2));
    }

    @Test
    public void 验证一级缓存是否存在() {
        InputStream inputStream = PostRepository.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Author author = sqlSession.selectOne("com.tal.gupao.mybatis.mapper.AuthorMapper.selectByPrimaryKey",1);
        System.out.println(author.getAuthorBio());
        Author author2 = sqlSession.selectOne("com.tal.gupao.mybatis.mapper.AuthorMapper.selectByPrimaryKey",1);
        System.out.println(author2.getAuthorBio());
        sqlSession.commit();
        sqlSession.close();
    }
}
