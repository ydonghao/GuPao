package com.tal.gupao.mybatis.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public AuthorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameIsNull() {
            addCriterion("author_username is null");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameIsNotNull() {
            addCriterion("author_username is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameEqualTo(String value) {
            addCriterion("author_username =", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameNotEqualTo(String value) {
            addCriterion("author_username <>", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameGreaterThan(String value) {
            addCriterion("author_username >", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("author_username >=", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameLessThan(String value) {
            addCriterion("author_username <", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameLessThanOrEqualTo(String value) {
            addCriterion("author_username <=", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameLike(String value) {
            addCriterion("author_username like", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameNotLike(String value) {
            addCriterion("author_username not like", value, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameIn(List<String> values) {
            addCriterion("author_username in", values, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameNotIn(List<String> values) {
            addCriterion("author_username not in", values, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameBetween(String value1, String value2) {
            addCriterion("author_username between", value1, value2, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorUsernameNotBetween(String value1, String value2) {
            addCriterion("author_username not between", value1, value2, "authorUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordIsNull() {
            addCriterion("author_password is null");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordIsNotNull() {
            addCriterion("author_password is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordEqualTo(String value) {
            addCriterion("author_password =", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotEqualTo(String value) {
            addCriterion("author_password <>", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordGreaterThan(String value) {
            addCriterion("author_password >", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("author_password >=", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordLessThan(String value) {
            addCriterion("author_password <", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordLessThanOrEqualTo(String value) {
            addCriterion("author_password <=", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordLike(String value) {
            addCriterion("author_password like", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotLike(String value) {
            addCriterion("author_password not like", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordIn(List<String> values) {
            addCriterion("author_password in", values, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotIn(List<String> values) {
            addCriterion("author_password not in", values, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordBetween(String value1, String value2) {
            addCriterion("author_password between", value1, value2, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotBetween(String value1, String value2) {
            addCriterion("author_password not between", value1, value2, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailIsNull() {
            addCriterion("author_email is null");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailIsNotNull() {
            addCriterion("author_email is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailEqualTo(String value) {
            addCriterion("author_email =", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotEqualTo(String value) {
            addCriterion("author_email <>", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailGreaterThan(String value) {
            addCriterion("author_email >", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("author_email >=", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailLessThan(String value) {
            addCriterion("author_email <", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailLessThanOrEqualTo(String value) {
            addCriterion("author_email <=", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailLike(String value) {
            addCriterion("author_email like", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotLike(String value) {
            addCriterion("author_email not like", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailIn(List<String> values) {
            addCriterion("author_email in", values, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotIn(List<String> values) {
            addCriterion("author_email not in", values, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailBetween(String value1, String value2) {
            addCriterion("author_email between", value1, value2, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotBetween(String value1, String value2) {
            addCriterion("author_email not between", value1, value2, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorBioIsNull() {
            addCriterion("author_bio is null");
            return (Criteria) this;
        }

        public Criteria andAuthorBioIsNotNull() {
            addCriterion("author_bio is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorBioEqualTo(String value) {
            addCriterion("author_bio =", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioNotEqualTo(String value) {
            addCriterion("author_bio <>", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioGreaterThan(String value) {
            addCriterion("author_bio >", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioGreaterThanOrEqualTo(String value) {
            addCriterion("author_bio >=", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioLessThan(String value) {
            addCriterion("author_bio <", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioLessThanOrEqualTo(String value) {
            addCriterion("author_bio <=", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioLike(String value) {
            addCriterion("author_bio like", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioNotLike(String value) {
            addCriterion("author_bio not like", value, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioIn(List<String> values) {
            addCriterion("author_bio in", values, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioNotIn(List<String> values) {
            addCriterion("author_bio not in", values, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioBetween(String value1, String value2) {
            addCriterion("author_bio between", value1, value2, "authorBio");
            return (Criteria) this;
        }

        public Criteria andAuthorBioNotBetween(String value1, String value2) {
            addCriterion("author_bio not between", value1, value2, "authorBio");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_author
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_author
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}