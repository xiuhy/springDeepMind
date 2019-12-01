package org.yhx.aop.spring.adviceAPI;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method,Object[] args,Object target,Throwable throwable){
        System.out.println("ExceptionAdvice 拦截 方法："+method.getName()+", 发生的异常:"+throwable.getMessage());
    }
}
