package org.yhx.learning.spring.cache.spel.first.ioc.domain;

public class Boss {

    private Car car;
    private String carId;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Boss(){
        System.out.println("construct boss");
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Boss(Car car){
        this.car=car;
        System.out.println("construct boss2");
    }
}
