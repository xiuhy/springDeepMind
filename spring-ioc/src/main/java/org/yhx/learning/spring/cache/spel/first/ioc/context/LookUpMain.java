package org.yhx.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.ioc.domain.Car;
import org.yhx.learning.spring.cache.spel.first.ioc.domain.MagicBoss;

public class LookUpMain {

    public static void main(String[] args){
        ApplicationContext act=new ClassPathXmlApplicationContext("spring-config.xml");
        MagicBoss magicBoss=act.getBean("magicBoss2", MagicBoss.class);
        Car car=magicBoss.getCar();
        System.out.println(car);
    }
}
