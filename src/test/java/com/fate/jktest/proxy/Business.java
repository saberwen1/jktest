package com.fate.jktest.proxy;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Business {

    public static void main(String[] args) {

  /*      NormalShopping normalShopping = new NormalShopping();
        InvocationHandler daiGou = new DaiGou(normalShopping);
        Shopping o = (Shopping)Proxy.newProxyInstance(NormalShopping.class.getClassLoader(), NormalShopping.class.getInterfaces(), daiGou);
        o.buy(100);*/

        CgLibProxy cgLibProxy = new CgLibProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(NormalShopping.class);
        enhancer.setCallback(cgLibProxy);
        Shopping shopping=(Shopping) enhancer.create();
        shopping.buy(100);
    }
}
