package org.yhx.aop.CGlib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object createProxy(Class targetClass) {
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("begin start method:"+method.getName()+",class:"+o.getClass());
//        Object result = method.invoke(o, objects);
        /**这里不能使用methodProxy.invoke 这个方法是调用原始方法，但是这里的Object 被拦截对象是enhancer创建的子类对象
         * 这样就会通过原始对象又被当前拦截器拦截，然后在拦截其中又调用原始对象，从而实现死循环调用 发生StackOverflowError
         */
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("end ");

        return result;
    }
}
