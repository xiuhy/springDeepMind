package org.yhx.aop.base;

//@TestArg
public class NaviWaiter implements Waiter {
    public void greetTo(String name) {

        System.out.println("greet to " + name);
//        throw new RuntimeException("test for throwable aop");
    }

    public void serverTo(String name) {
        System.out.println("server to " + name);
    }

    public void hasError() {
        System.out.println("will throw a exception");
        throw new RuntimeException("test excetpion");
    }

    public String whereIs(int tableNo) {

        if (tableNo < 4) {
            return "东南";
        } else if (tableNo < 6) {
            return "西北";
        } else if (tableNo < 8) {
            return "正北";
        } else {
            return "客满";
        }
    }

    @Override
    public String testArgAop(BaseArg baseArg) {
        System.out.println(baseArg.getData() + ",class=" + baseArg.getClass());
        return baseArg.getClass().toString();
    }
}
