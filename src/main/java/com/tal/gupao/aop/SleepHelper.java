package com.tal.gupao.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("睡后穿衣");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("睡前脱衣！");
    }

    public void beforeSleep(){
        System.out.println("睡觉前要脱衣服!");
    }

    public void afterSleep(){
        System.out.println("睡醒了要穿衣服！");
    }
}
