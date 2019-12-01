package org.yhx.aop.learning.spring.cache.spel.first.ioc.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StringUtils;
import org.yhx.aop.learning.spring.cache.spel.first.ioc.domain.Car;

public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public Car getObject() throws Exception {

        Car car = new Car();

        if (!StringUtils.isEmpty(carInfo)) {
            String[] infos = carInfo.split(",");
            car.setBrand(infos[0]);
            car.setMaxSpeed(Integer.valueOf(infos[1]));
            car.setPrice(Double.valueOf(infos[2]));
        }
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
