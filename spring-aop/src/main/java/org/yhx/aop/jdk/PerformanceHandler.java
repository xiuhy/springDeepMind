package org.yhx.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    public PerformanceHandler(Object target){
        this.target=target;
    }

    private Object target;

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("before advice ");
        //这里是拦截所有方法，如果需要指定方法，只能在method做匹配
        Object result=method.invoke(target,objects);
        System.out.println("after advice");
        return result;
    }
}
