package org.yhx.learning.spring.cache.spel.first.aop.adviceAPI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.aop.domain.Waiter;

public class BeforeAdviceXmlBeanMain {

    public static void main(String[] args){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        //使用proxyBeanFactory
//       Waiter waiterProxy= (Waiter) applicationContext.getBean("waiterProxy");
//       waiterProxy.greetTo("xmlYhx");

        //使用AutoProxyCreator
       Waiter waiterProxy= (Waiter) applicationContext.getBean("target");
        waiterProxy.greetTo("xmlYhx");
    }
}
