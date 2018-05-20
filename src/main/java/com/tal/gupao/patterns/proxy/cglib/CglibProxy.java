package com.tal.gupao.patterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object target;
    private String movie;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        try {
            Field field = this.target.getClass().getDeclaredField("movie");
            field.setAccessible(true);
            this.movie = (String) field.get(this.target);
        } catch (Exception e) {
            e.printStackTrace();
        }

        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);

        return enhancer.create(new Class[]{String.class}, new String[]{this.movie});
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Start downloading movie!");
        proxy.invokeSuper(obj, args);
        System.out.println("End downloading movie!");

        return null;
    }
}
