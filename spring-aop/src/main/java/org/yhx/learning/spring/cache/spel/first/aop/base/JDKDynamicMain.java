package org.yhx.learning.spring.cache.spel.first.aop.base;

import java.lang.reflect.Proxy;

public class JDKDynamicMain {

    public static void main(String[] args){
        TestTarget target = new TestTargetClasss();
        PerformHandler performHandler=new PerformHandler(target);
        TestTarget proxy2= (TestTarget)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                performHandler);
        proxy2.testStart("start aop");
    }
}
