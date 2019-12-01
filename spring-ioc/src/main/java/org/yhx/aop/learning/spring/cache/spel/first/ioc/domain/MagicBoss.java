package org.yhx.aop.learning.spring.cache.spel.first.ioc.domain;

//通过Look-up xml配置实现动态获取容器中bean;
//一般使用场景：在一个singleton的bean中获取一个属性或者字段获取一个prototype的bean
public class MagicBoss {

    public MagicBoss(){
        System.out.println("start magic boss");
    }
    public Car getCar(){

        return null;
    }
}
