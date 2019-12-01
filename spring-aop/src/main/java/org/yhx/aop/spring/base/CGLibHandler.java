package org.yhx.aop.spring.base;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib 实现aop
 */
public class CGLibHandler  implements MethodInterceptor{

    Enhancer enhancer=new Enhancer();

    public Object getProxy(Class cls){
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

            System.out.println(method.getName()+ " has been invoked");
            return methodProxy.invokeSuper(o,objects);
            }
}
