package com.tal.gupao.mybatis.mapper;

import com.tal.gupao.mybatis.dao.bean.Blog;
import com.tal.gupao.mybatis.dao.bean.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int countByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int deleteByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    List<Blog> selectByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    Blog selectByPrimaryKey(Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_blog
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Blog record);
}