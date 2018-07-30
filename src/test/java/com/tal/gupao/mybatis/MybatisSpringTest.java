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

import java.sql.*;

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


    @Test
    public void test() throws SQLException {
        try {
            //       1通过直接赋值方式配置
            String url = "jdbc:mysql:///dbname";
            String user = "root";
            String password = "";
            String driverClass = "com.mysql.jdbc.Driver";

//      连接操作
            Class.forName(driverClass);
            Connection connection = DriverManager.getConnection(url, user, password);

//      crud（增删改查）操作
            String sql = "select * from test where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
//      解析结果
            Object student = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int age = resultSet.getInt("age");
                //do sth
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
