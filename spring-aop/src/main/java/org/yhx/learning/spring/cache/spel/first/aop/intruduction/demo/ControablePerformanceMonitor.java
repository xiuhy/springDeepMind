package org.yhx.learning.spring.cache.spel.first.aop.intruduction.demo;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControablePerformanceMonitor  extends DelegatingIntroductionInterceptor implements  Monitor{

    ThreadLocal<Boolean> local = new ThreadLocal<Boolean>();

    public void setMonitorActive(Boolean active) {
        local.set(active);
    }

    /**
     * Subclasses may need to override this if they want to perform custom
     * behaviour in around advice. However, subclasses should invoke this
     * method, which handles introduced interfaces and forwarding to the target.
     *
     * @param mi
     */
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {

        if(local.get()!=null&&local.get()){
            System.out.println("start performance method");
            return super.invoke(mi);
        }else{
            return super.invoke(mi);
        }
    }
}
