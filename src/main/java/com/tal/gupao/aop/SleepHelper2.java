package com.tal.gupao.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SleepHelper2 {

    public SleepHelper2() {
    }

    @Pointcut("execution(public void com.tal.gupao.aop.Me.sleep())")
    public void sleeppoint(){}

    @Before("sleeppoint()")
    public void beforeSleep() {
        System.out.println("睡前脱衣！");
    }

    @AfterReturning("sleeppoint()")
    public void afterSleep() {
        System.out.println("睡后穿衣");
    }

}
