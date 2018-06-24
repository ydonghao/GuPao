package com.tal.gupao.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class HSqlSessionFactory {

    private static SqlSessionFactory sqlSessionFactory;

    private HSqlSessionFactory() {};

    private static SqlSessionFactory getSqlSessionFactory() {
        InputStream inputStream = CommentRepository.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    public static synchronized SqlSessionFactory getInstance() {
        return sqlSessionFactory == null ? getSqlSessionFactory() : sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        return getInstance().openSession();
    }
}
