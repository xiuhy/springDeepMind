package org.yhx.aop.base;

/**
 * 入参继承类
 */
// TestArg 注解在最高层基类入参类型中，理论上只能匹配该类型
//@TestArg
public class BaseArg {
    Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
