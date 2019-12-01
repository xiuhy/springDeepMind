package org.yhx.aop.spring.adviceAPI.before;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.yhx.aop.base.NaviWaiter;
import org.yhx.aop.base.Waiter;

public class BeforeAdviceMain {

    public static void main(String[] args){

        Waiter waiter=new NaviWaiter();
        BeforeAdvice advice = new WaiterBeforeAdvice();
       ProxyFactory proxyFactory=new ProxyFactory(waiter);
       proxyFactory.addAdvice(advice);
       proxyFactory.setOptimize(true);
       Waiter waiterProxy=(Waiter)proxyFactory.getProxy();
       waiterProxy.greetTo("yhx");
        waiterProxy.serverTo("server yhx");
    }
}
