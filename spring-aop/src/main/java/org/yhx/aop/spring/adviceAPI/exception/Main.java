package org.yhx.aop.spring.adviceAPI.exception;

import org.springframework.aop.framework.ProxyFactory;
import org.yhx.aop.base.ThrowsWaiter;
import org.yhx.aop.base.Waiter;

public class Main {

    public static void main(String[] args) {

        ExceptionAdvice exceptionAdvice=new ExceptionAdvice();
        ThrowsWaiter exceptionWaiter=new ThrowsWaiter();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(exceptionWaiter);
        proxyFactory.addAdvice(exceptionAdvice);

        Waiter proxy=(Waiter)proxyFactory.getProxy();
        proxy.greetTo("yhx");
    }
}
