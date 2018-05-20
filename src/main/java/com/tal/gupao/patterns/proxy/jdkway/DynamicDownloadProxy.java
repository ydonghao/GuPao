package com.tal.gupao.patterns.proxy.jdkway;

import com.tal.gupao.patterns.proxy.staticway.Tal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicDownloadProxy implements InvocationHandler {

    private Tal target;

    public DynamicDownloadProxy(Tal target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target, args);
    }
}
