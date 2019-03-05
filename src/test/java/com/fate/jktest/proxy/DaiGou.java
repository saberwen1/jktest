package com.fate.jktest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DaiGou implements InvocationHandler {
    NormalShopping normalShopping;

    public DaiGou(NormalShopping normalShopping) {
        this.normalShopping = normalShopping;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始,有多少钱："+args[0]);
        method.invoke(normalShopping, args);
        System.out.println("还剩下：" + normalShopping.money);
        return null;
    }
}
