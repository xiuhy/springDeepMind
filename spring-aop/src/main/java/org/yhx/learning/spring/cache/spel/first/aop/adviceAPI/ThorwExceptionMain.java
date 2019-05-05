package org.yhx.learning.spring.cache.spel.first.aop.adviceAPI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.aop.domain.ThrowsWaiter;

public class ThorwExceptionMain {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ThrowsWaiter throwsWaiter=(ThrowsWaiter)context.getBean("exceptionProxy");
        throwsWaiter.greetTo("test");
    }
}
