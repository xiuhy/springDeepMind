package org.yhx.aop.base;

public interface Waiter {

    void greetTo(String name);

    void serverTo(String name);

    void hasError();

    String whereIs(int tableNo);
}
