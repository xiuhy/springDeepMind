package org.yhx.aop.spring.domain;

//测试异常拦截
public class ThrowsWaiter implements  Waiter {

    public void greetTo(String name) {
        throw  new RuntimeException("以外的异常");
    }

    public void serverTo(String name) {
        throw  new UnsupportedOperationException("sql异常");
    }

    public void hasError() {

    }

    public String whereIs(int tableNo) {
        return null;
    }
}
