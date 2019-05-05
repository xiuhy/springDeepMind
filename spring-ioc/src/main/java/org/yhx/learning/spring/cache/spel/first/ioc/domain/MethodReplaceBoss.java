package org.yhx.learning.spring.cache.spel.first.ioc.domain;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MethodReplaceBoss implements MethodReplacer {
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        Car car=new Car();
        car.setPrice(23.1233);
        car.setBrand("Mirata");
        return car;
    }
}
