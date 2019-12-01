package org.yhx.aop.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.aop.base.Waiter;

/**
 *  通过spring xml 配置文件实现spring aop api ，省去 api 模块使用代码实现proxyFactory 繁杂
 *
 *    proxyFactoryBean spring实现ben对象工厂类
 *    target:代理目标对象；
 *    interceptor:指定 advice，
 *    proxyInterface:、代理对象接口实现
 *     singleton 返回proxy是否是单例模式； optimize:优化项，true使用cglib,false jdk
 *     proxyTargetClass:是否对类进行代理；true：使用cglib代理
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop-config.xml");
        // 这里直接调用 proxyFactoryBean 创建的实例，因为这个bean实现就是一个动态代理
        Waiter waiter=applicationContext.getBean("waiterProxy", Waiter.class);
        waiter.greetTo("yhx xml");
    }
}
