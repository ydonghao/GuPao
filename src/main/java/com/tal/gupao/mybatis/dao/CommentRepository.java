package com.tal.gupao.mybatis.dao;

import com.tal.gupao.mybatis.dao.bean.Comment;
import com.tal.gupao.mybatis.mapper.CommentMapper;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

public class CommentRepository {

    @Test
    public void test1() throws IOException {
        InputStream inputStream = CommentRepository.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);
        Comment comment = mapper.selectByPrimaryKey(1L);
        Assert.assertEquals(java.util.Optional.of(1L), java.util.Optional.ofNullable(comment.getId()));
        Assert.assertEquals("大幅度的", comment.getCommand());
    }
    @Test
    public void test2() throws IOException {
        DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(CommentMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
    }

}
