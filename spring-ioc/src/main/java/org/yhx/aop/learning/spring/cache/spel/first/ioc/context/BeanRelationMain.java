package org.yhx.aop.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.aop.learning.spring.cache.spel.first.ioc.domain.Boss;
import org.yhx.aop.learning.spring.cache.spel.first.ioc.domain.Car;

//bean 之间关联关系：继承，依赖，引用
public class BeanRelationMain {

    public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(applicationContext.getBean("MZD_bean2", Car.class));
        System.out.println(applicationContext.getBean("boss1", Boss.class).getCarId());
        System.out.println("spring application has been started");
    }
}
