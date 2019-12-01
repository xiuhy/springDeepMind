package org.yhx.aop.spring.adviceAPI.before;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class WaiterBeforeAdvice implements MethodBeforeAdvice {

    /**
     * Callback before a given method is invoked.
     *
     * @param method method being invoked
     * @param args   arguments to the method
     * @param target target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("WaiterAdvice Hello "+args[0]);
    }
}
