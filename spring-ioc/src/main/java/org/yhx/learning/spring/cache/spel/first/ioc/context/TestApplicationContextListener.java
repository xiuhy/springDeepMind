package org.yhx.learning.spring.cache.spel.first.ioc.context;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestApplicationContextListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("先搞起");
    }
}
