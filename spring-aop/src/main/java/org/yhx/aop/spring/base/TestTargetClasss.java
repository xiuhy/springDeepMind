package org.yhx.aop.spring.base;

public class TestTargetClasss  implements TestTarget{

    public void testStart(String content) {
        System.out.println("start :"+content);
    }

    public String testEnd(int flag) {
        System.out.println("start :"+flag);
        return flag+"-abc";
    }
}
