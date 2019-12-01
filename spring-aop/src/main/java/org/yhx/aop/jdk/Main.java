package org.yhx.aop.jdk;

import org.yhx.aop.base.ForumService;
import org.yhx.aop.base.ForumServiceImpl;

import java.lang.reflect.Proxy;

/**
 * 通过JDK动态接口代理实现AOP
 * Proxy: 动态代理对象，通过newProxyInstance创建织入切面到目标接口的实例
 * InvocationHandler ：JDK 动态代理接口
 * 注：JDK Proxy只能对接口实现动态代理
 */
public class Main {

    public static void main(String[] args) {

        ForumService forumService=new ForumServiceImpl();
        PerformanceHandler performanceHandler=new PerformanceHandler(forumService);
        //这里返回类型是Object,需要根据被代理接口实现强制转换
        ForumService proxy=(ForumService)Proxy.newProxyInstance(forumService.getClass().getClassLoader(),forumService.getClass().getInterfaces(),performanceHandler);
        proxy.removeForum(100);
        proxy.removeTopic(1);
    }
}
