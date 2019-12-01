package org.yhx.aop.spring.intruduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhx.aop.base.Waiter;

/**
 *  引介增强 特殊的增强 連接點是類型，因为引介增强 是针对类提供新的属性或者方法
 *  spring中定义了引介增强接口：IntroductionInterceptor，但是这个是标记接口即没有任何实现
 *  但是，同时提供DelegatingIntroductionInterceptor.只需要继承该接口即可
 *  使用方式：同一般advice一样，可以通过代码ProxyFactory 或者xml ProxyFactoryBean 实现
 *  与一般advice区别：
 *  1. 必须实例化引介增强（introductionInterceptor）的接口
 *  2. 引介增强只能通过创建子类实现动态代理，所以ProxyFactory 的属性proxyTargetClass 为true
 */
public class IntroductionMain {

    public static void main(String[] args){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop-config.xml");
        Waiter waiterProxy= (Waiter) applicationContext.getBean("introdcutionProxy");
        waiterProxy.greetTo("xmlYhx");

        Monitor monitor=(Monitor)waiterProxy;
        monitor.setMonitorActive(true);
        waiterProxy.greetTo("xmlYhx");
    }
}
