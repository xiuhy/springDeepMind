package org.yhx.aop.spring.aspectJ;

import org.aspectj.lang.annotation.Pointcut;

public class PintCutDeclarer {

    @Pointcut("execution(* serverTo(String))&&args(name)")
    public void pointcute2(String name){}
}
