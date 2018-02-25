package org.yhx.spring.deepmind.scheduler.taskScheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


/**
 * 这里主要是通过xml配置实现
 *
 * **/
public class XMLSimpleTaskScheduler {
    Logger logger= LoggerFactory.getLogger(SimpleTaskScheduler.class);

    public void scheduler(){
        logger.info("XMLSimpleTaskScheduler.scheduler date="+new Date());
    }

    public void scheduler2(){
        logger.info("XMLSimpleTaskScheduler.scheduler2 date="+new Date());
    }

}
