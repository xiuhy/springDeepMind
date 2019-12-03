package org.yhx.aop.base;

@TestArg
public interface Waiter {

    void greetTo(String name);

    void serverTo(String name);

    void hasError();

    String whereIs(int tableNo);

    default String testArgAop(BaseArg baseArg){
        return null;
    }

}
