package org.yhx.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.learning.spring.cache.spel.first.ioc.domain.Car;

public class ApplicationContextMain {

    public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("started application");
        Car car=(Car)applicationContext.getBean("car");
        System.out.println(car.getBrand());

        //property placehoder 加载
        System.out.println("property placeholder");
        Car carPlaceholder=(Car)applicationContext.getBean("car-placeholder");
        System.out.println(carPlaceholder);

//        Annotation property
        System.out.println("annotation property");
        Car carannotation=(Car)applicationContext.getBean("car-annotation");
        System.out.println(carannotation);

    }
}
