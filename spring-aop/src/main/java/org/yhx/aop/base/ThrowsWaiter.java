package org.yhx.aop.base;


//测试异常拦截
public class ThrowsWaiter implements Waiter {

    public void greetTo(String name) {
        throw  new RuntimeException("sorry "+name+", i am sick ");
    }

    public void serverTo(String name) {
        throw  new UnsupportedOperationException("sorry "+name+", i am boss ");
    }

    public void hasError() {

    }

    public String whereIs(int tableNo) {
        return null;
    }
}
