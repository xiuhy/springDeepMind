package org.yhx.aop.spring.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.yhx.aop.base.*;

/**
 *  通过 AspectJ 实现aop
 *  前提：
 *  1. jdk5.0以上，必须支持注解
 *  2. aspectJ需要特殊字节码，所以要引入asm jar包
 *  3. 引入aspectj.weaver 和aspectj.tools 类包
 *
 *  使用步骤：
 *  1. 必须先@Aspect，或者<aop:aspectj-autoproxy />通过aop:aspectj 自动实现注入代理功能
 *  最后如果需要通过注解实现aop,必须添加@Component到指定advice并且在配置文件中添加扫描
 *
*/
public class Main {

    public static void main(String[] args) {

        //通过schema 配置文件完成
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop-aspectj.xml");
        Waiter target = applicationContext.getBean("target", Waiter.class);
        target.serverTo("test");
        target.hasError();
        System.out.println("----------------next will process afterReturning----------------");
        System.out.println(target.whereIs(100));
        System.out.println(target.whereIs(2));
        System.out.println("----------------next will test args pointcut----------------");
        BaseArg basearg=new BaseArg();
        basearg.setData("baseArg");

        SuperArg1 superArg1=new SuperArg1();
        superArg1.setData("superArg1");

        SuperArg2 superArg2=new SuperArg2();
        superArg2.setData("superArg2");

        SuperArg3 superArg3=new SuperArg3();
        superArg3.setData("superArg2");

        target.testArgAop(superArg3);
    }
}
