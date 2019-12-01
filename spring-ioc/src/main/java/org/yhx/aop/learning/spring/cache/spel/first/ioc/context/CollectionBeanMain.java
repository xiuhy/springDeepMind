package org.yhx.aop.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

//集合bean
public class CollectionBeanMain {

    public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(applicationContext.getBean("list1", List.class));
        List<Long> longLis=(List)applicationContext.getBean("list1");
        System.out.println("longList:"+longLis.get(0));
        System.out.println(applicationContext.getBean("set1", Set.class));
        System.out.println("spring application has been started");
    }
}
