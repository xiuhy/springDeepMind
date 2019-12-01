package org.yhx.aop.CGlib;

import org.yhx.aop.base.ForumServiceImpl;

/**
 *  CGlib 实现动态代理AOP效果
 *  1. Enhancer 通过从底层字节码创建一个子类作为代理实现
 *  2. 实现MethodInterceptor 接口，动态定义切面内容
 *  intercept 方法：Object 是目标对象(即enhance创建子类),method 目标调用方法对象；args:方法参数，proxy:代理对象，调用子类
 */
public class Main {

    public static void main(String[] args) {

        CglibProxy cglibProxy=new CglibProxy();
        ForumServiceImpl forumService=(ForumServiceImpl)cglibProxy.createProxy(ForumServiceImpl.class);
        forumService.removeForum(100);
    }
}
