package com.tal.gupao.aop;

public class Me implements Sleepable {
    @Override
    public void sleep() {
        System.out.println("睡觉！不休息哪有力气学习！");
    }
}
