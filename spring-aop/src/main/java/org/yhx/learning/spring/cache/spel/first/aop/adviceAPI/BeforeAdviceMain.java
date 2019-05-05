package org.yhx.learning.spring.cache.spel.first.aop.adviceAPI;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.yhx.learning.spring.cache.spel.first.aop.domain.NaviWaiter;
import org.yhx.learning.spring.cache.spel.first.aop.domain.Waiter;

public class BeforeAdviceMain {

    public static void main(String[] args){

        Waiter waiter=new NaviWaiter();
        BeforeAdvice advice = new WaiterAdvice();
       ProxyFactory proxyFactory=new ProxyFactory(waiter);
       proxyFactory.addAdvice(advice);
       proxyFactory.setOptimize(true);
       Waiter waiterProxy=(Waiter)proxyFactory.getProxy();
       waiterProxy.greetTo("yhx");
        waiterProxy.serverTo("server yhx");
    }
}
