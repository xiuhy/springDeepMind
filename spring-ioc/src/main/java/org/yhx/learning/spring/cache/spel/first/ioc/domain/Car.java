package org.yhx.learning.spring.cache.spel.first.ioc.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car-annotation")
public class Car {

    @Value("${car-brand}")
    private String brand;
    @Value("${car-maxSpeed}")
    private Integer maxSpeed;
    @Value("${car-price}")
    private Double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public Car(){
        System.out.println("construct car");
    }
}
