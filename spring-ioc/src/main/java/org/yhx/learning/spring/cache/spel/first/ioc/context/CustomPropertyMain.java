package org.yhx.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.ioc.domain.Boss;

public class CustomPropertyMain {

    public static void main(String[] args){
        ApplicationContext act=new ClassPathXmlApplicationContext("spring-config.xml");
       Boss boss= act.getBean("editorProperty", Boss.class);

       System.out.println(boss.getCar());
    }
}
