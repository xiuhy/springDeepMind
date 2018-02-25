package org.yhx.spring.deepmind.scheduler.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


/**
 *  Task Scheduler  spring 执行计划一种实现
 *  task Scheduler 主要接口是 TaskScheduler.可以实现定期触发，周期触发，自定义触发器
 *  Trigger主要的接口是 Trigger，其中 实现Trigger 有 cronTrigger,PeriodicTrigger
 *  cronTrigger 只支持6位：秒，分，时，日，月，星期 其他语法和cron表达式一致
 *  scheduler任务必须是void返回并且无参数内容
 *
 *  这里是scheduled和xml配置一同使用。使用xml配置scheduler时 必须配置<task:annotation-driven/>,然后在实例化bean即可
 *
 *  ------------------ xml 配置-------------------------------
 *   在xml配置中有两个主要节点：<task:Scheduler>, <task:executor id>
 *   共有的属性就是id，作为线程名称前缀实现。scheduler是ThreadPoolExcutor实例。和executor节点区别主要是excutor
 *   支持更多属性：core size,max size,keep-live,queue-capacity 等。这两个节点主要给实际任务（job/task)提供线程池支持
 *   scheduler不定义pool-size 默认单线程执行。
 *
 *   另外一个节点：<task:scheduled-tasks scheduler> 这个节点下管理多个子节点.scheduler属性是对应上面两个主节点id
 *   子节点：
 *   <task:scheduled ref="" method="" cron="" fixed-delay fixed-rate 等> 子节点主要提供正真任务的方法和触发器内容
 *
 * **/
public class SimpleTaskScheduler {

//    @Scheduled(cron = "0/2 * * * * ?")
//    public void scheduler1(){
//        System.out.println("scheduler1 date="+new Date());
//    }

    @Scheduled(fixedDelay = 5000)
    public void scheduler2(){
        System.out.println("scheduler2 date="+new Date());
    }

    @Scheduled(fixedRate = 5000)
    public void scheduler3() throws Exception{
        Thread.sleep(2000);
        System.out.println("scheduler3 date="+new Date());
    }
}
