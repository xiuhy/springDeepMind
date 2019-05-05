package org.yhx.learning.spring.cache.spel.first.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.aop.domain.Waiter;

public class StaticMethodMain {

    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
//        调用proxyFactoryBean实现aop
//        Waiter  waiter= applicationContext.getBean("staticAdisorProxy",Waiter.class);
//        waiter.serverTo("这个不响");
//        System.out.println("over invoke");
//        waiter.greetTo("无聊啊");

//        通过defaultAdvisorAutoPrxyCreator实现代理
        Waiter waiterProxy= (Waiter) applicationContext.getBean("target");
        waiterProxy.greetTo("xmlYhx");

    }
}
