package org.yhx.aop.spring.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.yhx.aop.base.Waiter;

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

        //通过代码代理 aspectJ
//        Waiter target=new NaviWaiter();
//        AspectJProxyFactory aspectJProxyFactory=new AspectJProxyFactory(target);
//        aspectJProxyFactory.addAspect(PreGrettingAspect.class);
//        Waiter waiterProxy= aspectJProxyFactory.getProxy();
//        waiterProxy.serverTo("hello aspectJ");


        //通过schema 配置文件完成
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
                "F:\\IDEA_WORKSPACE\\springDeepMind\\spring-aop\\src\\main\\java\\org\\yhx\\learning\\" +
                        "spring\\aop\\aspectJ\\spring-aop-config.xml");
        Waiter target = applicationContext.getBean("target", Waiter.class);
        target.serverTo("test");
        System.out.println("next will throw a exception");
        target.hasError();
        System.out.println("next will process afterReturning");
        System.out.println(target.whereIs(100));
        System.out.println(target.whereIs(2));
    }
}
