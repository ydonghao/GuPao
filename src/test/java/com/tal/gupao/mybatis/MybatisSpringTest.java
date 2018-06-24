package com.tal.gupao.mybatis;

import com.tal.gupao.mybatis.dao.bean.User;
import com.tal.gupao.mybatis.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-application-context.xml"})
public class MybatisSpringTest {

    @Autowired
    @Qualifier(value = "userMapper")
    UserMapper userMapper;

    @Test
    public void userTest() {
        User user = userMapper.getUser("1");
        Assert.assertEquals("admin", user.getName());
    }
}
