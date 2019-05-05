package org.yhx.learning.spring.cache.spel.first.aop.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.aop.domain.Waiter;

public class Main {

    public static void main(String[] args) {

        //通过代码代理 aspectJ
//        Waiter target=new NaviWaiter();
//        AspectJProxyFactory aspectJProxyFactory=new AspectJProxyFactory(target);
//        aspectJProxyFactory.addAspect(PreGrettingAspect.class);
//        Waiter waiterProxy= aspectJProxyFactory.getProxy();
//        waiterProxy.serverTo("hello aspectJ");


        //通过schema 配置文件完成
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\IDEA_WORKSPACE\\springDeepMind\\spring-aop\\src\\main\\java\\org\\yhx\\learning\\spring\\aop\\aspectJ\\spring-config.xml");
        Waiter target = applicationContext.getBean("target", Waiter.class);
        target.serverTo("test");
        System.out.println("next will throw a exception");
        target.hasError();
        System.out.println("next will process afterReturning");
        System.out.println(target.whereIs(100));
        System.out.println(target.whereIs(2));
    }
}
