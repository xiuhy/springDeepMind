package org.yhx.aop.learning.spring.cache.spel.entity;

import java.util.Date;
import java.util.List;

public class User {

    String userName;
    Integer credits;
    Date lastVisit;
    Place placeOfBirth;
    List<String> hobby;

    public User(){}
    public User(String userName, Integer credits) {
        this.userName = userName;
        this.credits = credits;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Place getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(Place placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", credits=" + credits +
                ", lastVisit=" + lastVisit +
                ", placeOfBirth=" + placeOfBirth +
                ", hobby=" + hobby +
                '}';
    }
}
