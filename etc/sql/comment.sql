/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.6.27-log : Database - mybatis
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis`;

/*Table structure for table `author` */

DROP TABLE IF EXISTS `tbl_author`;

CREATE TABLE `tbl_author` (
  `author_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '作者ID主键',
  `author_username` varchar(30) NOT NULL COMMENT '作者用户名',
  `author_password` varchar(32) NOT NULL COMMENT '作者密码',
  `author_email` varchar(50) NOT NULL COMMENT '作者邮箱',
  `author_bio` varchar(1000) DEFAULT '这家伙很赖，什么也没留下' COMMENT '作者简介',
  `register_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `author` */


insert into `tbl_author`(`author_id`,`author_username`,`author_password`,`author_email`,`author_bio`,`register_time`) values (1,'张三','123456','123@qq.com','张三是个新手，刚开始注册','2015-10-29 10:23:59'),(2,'李四','123asf','lisi@163.com','魂牵梦萦 ','2015-10-29 10:24:29'),(3,'王五','dfsd342','ww@sina.com','康熙王朝','2015-10-29 10:25:23'),(4,'赵六','123098sdfa','zhaoliu@qq.com','花午骨','2015-10-29 10:26:09'),(5,'钱七','zxasqw','qianqi@qq.com','这家伙很赖，什么也没留下','2015-10-29 10:27:04'),(6,'张三丰','123456','zhangsf@qq.com','这家伙很赖，什么也没留下','2015-10-29 11:48:00'),(7,'张无忌','qwertyuiop','wuji@163.com','这家伙很赖，什么也没留下','2015-10-29 11:48:24');
/*Table structure for table `blog` */

DROP TABLE IF EXISTS `tbl_blog`;

CREATE TABLE `tbl_blog` (
  `blog_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'BlogId主键',
  `blog_title` varchar(255) NOT NULL COMMENT 'blog标题',
  `author_id` int(11) unsigned NOT NULL COMMENT '作者ID外键',
  PRIMARY KEY (`blog_id`),
  KEY `fk_author_id` (`author_id`),
  CONSTRAINT `fk_author_id` FOREIGN KEY (`author_id`) REFERENCES `tbl_author` (`author_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `blog` */

insert  into `tbl_blog`(`blog_id`,`blog_title`,`author_id`) values (1,'小张的Blog',1),(2,'小李',2),(3,'王五不是人',3),(4,'赵地人',4),(5,'钱钱钱',5);

/*Table structure for table `posts` */

DROP TABLE IF EXISTS `tbl_posts`;

CREATE TABLE `tbl_posts` (
  `post_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '文章主键ID',
  `post_subject` varchar(255) NOT NULL COMMENT '文章主题，标题',
  `post_body` text NOT NULL COMMENT '文章内容最大3000个字符',
  `blog_id` int(11) unsigned NOT NULL COMMENT 'Blog主键做外键',
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '文章创建时间',
  PRIMARY KEY (`post_id`),
  KEY `fk_blog_id` (`blog_id`),
  CONSTRAINT `fk_blog_id` FOREIGN KEY (`blog_id`) REFERENCES `tbl_blog` (`blog_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `posts` */

insert  into `tbl_posts`(`post_id`,`post_subject`,`post_body`,`blog_id`,`createtime`) values (1,'Mybatis入门一','什么是 MyBatis ？\r\nMyBatis 是支持定制化 SQL、存储过程以及高级映射的优秀的持久层框架。MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集。MyBatis 可以对配置和原生Map使用简单的 XML 或注解，将接口和 Java 的 POJOs(Plain Old Java Objects,普通的 Java对象)映射成数据库中的记录。',1,'2015-10-29 10:32:21'),(2,'Mybatis入门二','要使用 MyBatis， 只需将 mybatis-x.x.x.jar 文件置于 classpath 中即可。',1,'2015-10-29 10:32:52'),(3,'Oracle学习','Oracle Database，又名Oracle RDBMS，或简称Oracle。是甲骨文公司的一款关系数据库管理系统',2,'2015-10-29 10:33:26'),(4,'JAVA学习一','Java是由Sun Microsystems公司于1995年5月推出的Java面向对象程序设计语言和Java平台的总称',3,'2015-10-29 10:34:17'),(5,'PL/SQL','PL/SQL也是一种程序语言，叫做过程化SQL语言（Procedural Language/SQL）。PL/SQL是Oracle数据库对SQL语句的扩展',4,'2015-10-29 10:37:52'),(6,'CSS标签选择器','标签选择器\r\nID选择器\r\n类选择器\r\n特殊选择器',5,'2015-10-29 10:39:44'),(7,'javascript','js:是前端脚本语言',2,'2015-10-29 10:40:18');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


DROP TABLE IF EXISTS tbl_user;
CREATE TABLE tbl_user (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(55) DEFAULT NULL,
  `pwd` VARCHAR(255) DEFAULT NULL,
  `status` VARCHAR(2) DEFAULT '1' COMMENT '#1 正常 2.封号 ',
  `icon` VARCHAR(255) DEFAULT 'images/guest.jpg',
  `email` VARCHAR(255) DEFAULT NULL,
  `createdate` DATETIME DEFAULT NULL,
  `phone` VARCHAR(20) DEFAULT NULL,
  `salt2` VARCHAR(55) DEFAULT NULL,
  `onlineStatus` VARCHAR(2) DEFAULT NULL COMMENT '在线状态  1-在线 0-离线',
  `lastUpdAcct` VARCHAR(20) DEFAULT NULL,
  `lastUpdTime` DATETIME DEFAULT NULL,
  `note` VARCHAR(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO tbl_user VALUES ('3', 'admin', '8b276c6430bc6cfec325a09dc6713167', '1', 'images/guest.jpg', '1233', '2017-05-11 15:54:56', '123', '66432cd44c4abf25202aca49a5e14436', NULL, 'admin', '2018-01-19 18:17:57', '用户修改个人资料');
