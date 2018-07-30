package com.tal.gupao.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        //如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式
        //ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("L:\\TalBen\\IdeaProjects\\GuPao\\src\\main\\resources\\application-aop.xml");
        Sleepable me = (Sleepable) appCtx.getBean("proxy");
        me.sleep();
    }

    @org.junit.Test
    public void test() {
        ApplicationContext appCtx2 = new FileSystemXmlApplicationContext("L:\\TalBen\\IdeaProjects\\GuPao\\src\\main\\resources\\application-aop2.xml");
        Sleepable me2 = (Sleepable) appCtx2.getBean("me");
        me2.sleep();
    }

    @org.junit.Test
    public void test2() {
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("L:\\TalBen\\IdeaProjects\\GuPao\\src\\main\\resources\\application-aop3.xml");
        Sleepable me = (Sleepable) appCtx.getBean("me");
        me.sleep();
    }

    @org.junit.Test
    public void test3() {
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("L:\\TalBen\\IdeaProjects\\GuPao\\src\\main\\resources\\application-aop4.xml");
        Sleepable me = (Sleepable) appCtx.getBean("me");
        me.sleep();
    }
}
