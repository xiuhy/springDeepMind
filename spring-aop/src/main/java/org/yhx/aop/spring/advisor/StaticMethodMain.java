package org.yhx.aop.spring.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.aop.base.Waiter;

public class StaticMethodMain {

    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop-config.xml");
//        调用proxyFactoryBean实现aop
//        Waiter  waiter= applicationContext.getBean("staticAdisorProxy",Waiter.class);
//        waiter.serverTo("这个不响");
//        System.out.println("over invoke");
//        waiter.greetTo("无聊啊");

//        通过defaultAdZvisorAutoPrxyCreator实现代理
        Waiter waiterProxy= applicationContext.getBean("target",Waiter.class);
        waiterProxy.greetTo("xmlYhx");

    }
}
