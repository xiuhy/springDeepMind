package org.yhx.spring.deepmind.scheduler.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  JVM 的 Timer 和TimerTask
 *  所有的task都是在一个线程中完成任务，Timer线程默认非守护线程。
 *  适合快速任务并且时间迭代简单
 *  spring4.x中已经不支持TimerTask功能了，所有放弃TimeTask
**/
public class SimpleTimerTask extends TimerTask {

    private int count=1;
    public void run() {
        System.out.println("timerTask test");
        Date date=new Date(scheduledExecutionTime());
        System.out.println("next start time="+date);
        if(++count>10) cancel();
    }

    public static void main(String[] args) throws Exception{
        TimerTask task = new SimpleTimerTask();
        Timer timer=new Timer();
        timer.schedule(task,1000L,2000L);
    }
}
