package org.yhx.learning.spring.cache.spel.first.ioc.factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.yhx.learning.spring.cache.spel.first.ioc.domain.Car;

//通过beanFactory实现 加载xml获取bena对象
public class OriginalBeanFactory {

    public static void main(String[] args) throws Exception{

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resourcer=resolver.getResources("classpath:spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resourcer);
       Car car= factory.getBean("car2", Car.class);
       System.out.println(car.getBrand());
    }
}
