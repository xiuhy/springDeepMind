package org.yhx.aop.spring.domain;

public interface Waiter {

    void greetTo(String name);

    void serverTo(String name);

    void hasError();

    String whereIs(int tableNo);
}
