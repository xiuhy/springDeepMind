package org.yhx.learning.spring.cache.spel.first.aop.intruduction.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.aop.domain.Waiter;

public class IntroductionMain {

    public static void main(String[] args){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Waiter waiterProxy= (Waiter) applicationContext.getBean("introdcutionProxy");
        waiterProxy.greetTo("xmlYhx");

        Monitor monitor=(Monitor)waiterProxy;
        monitor.setMonitorActive(true);
        waiterProxy.greetTo("xmlYhx");
    }
}
