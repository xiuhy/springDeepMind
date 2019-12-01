package org.yhx.aop.spring.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformHandler implements InvocationHandler {

    TestTarget target;
    public PerformHandler(TestTarget handler){
        this.target=handler;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("点用之前说句话");
        return method.invoke(this.target,args);
    }
}
