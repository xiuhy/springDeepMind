package org.yhx.learning.spring.cache.spel.first.aop.domain;

public interface Waiter {

    void greetTo(String name);

    void serverTo(String name);

    void hasError();

    String whereIs(int tableNo);
}
