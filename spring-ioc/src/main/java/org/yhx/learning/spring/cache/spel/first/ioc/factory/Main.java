package org.yhx.learning.spring.cache.spel.first.ioc.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.ioc.domain.Car;

public class Main {

    public static void main(String[] args){

        ApplicationContext applicationContent=new ClassPathXmlApplicationContext("spring-config.xml");
        Car car=applicationContent.getBean("car", Car.class);
        System.out.println(car);
    }

}
