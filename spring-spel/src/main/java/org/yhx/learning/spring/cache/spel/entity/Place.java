package org.yhx.learning.spring.cache.spel.entity;

public class Place {

    String contrue;
    String city;
    public String getContrue() {
        return contrue;
    }

    public void setContrue(String contrue) {
        this.contrue = contrue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Place(String contrue, String city) {
        this.contrue = contrue;
        this.city = city;
    }
}
