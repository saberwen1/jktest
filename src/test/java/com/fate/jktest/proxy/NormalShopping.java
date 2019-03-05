package com.fate.jktest.proxy;

public class NormalShopping implements Shopping {
    public static int money;
    @Override
    public void buy(int moneyIn) {
        System.out.println("购物50元");
        this.money = moneyIn;
        money -= 50;
        System.out.println("退款：" + money + "元");
    }
}
