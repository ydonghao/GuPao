package com.tal.gupao.mybatis.mapper;

import com.tal.gupao.mybatis.dao.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository(value = "userMapper")
public interface UserMapper {

    @Select("SELECT * FROM tbl_user WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

}