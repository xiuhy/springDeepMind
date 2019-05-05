package org.yhx.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

public class ApplicationEventPublisherTest implements ApplicationEventPublisher {

    public void publishEvent(ApplicationEvent event) {
        System.out.println("publishEvent");
    }

    public void publishEvent(Object event) {
        System.out.println("publishEvent--Object");
    }
}
