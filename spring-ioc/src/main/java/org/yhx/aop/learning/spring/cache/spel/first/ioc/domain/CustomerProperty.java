package org.yhx.aop.learning.spring.cache.spel.first.ioc.domain;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class CustomerProperty extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        if(StringUtils.isEmpty(text)){
            throw new RuntimeException("no content ");
        }

        String[] propertiey=text.split(",");
        Car car=new Car();
        car.setBrand(propertiey[0]);
        car.setPrice(Double.valueOf(propertiey[1]));
        car.setMaxSpeed(Integer.valueOf(propertiey[2]));
        setValue(car);
    }
}
