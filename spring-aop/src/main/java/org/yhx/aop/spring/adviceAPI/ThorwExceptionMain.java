package org.yhx.aop.spring.adviceAPI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.aop.spring.domain.ThrowsWaiter;

public class ThorwExceptionMain {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-config.xml");
        ThrowsWaiter throwsWaiter=(ThrowsWaiter)context.getBean("exceptionProxy");
        throwsWaiter.greetTo("test");
    }
}
