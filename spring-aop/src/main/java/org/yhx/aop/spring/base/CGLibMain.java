package org.yhx.aop.spring.base;

public class CGLibMain {

    public static void main(String[] args){
        CGLibHandler proxy=new CGLibHandler();
        TestTargetClasss targetClasss = (TestTargetClasss)proxy.getProxy(TestTargetClasss.class);
        targetClasss.testStart("CGLib aop");
    }
}
