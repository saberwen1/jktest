package com.fate.jktest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Fruit {

    public  void say() {
        System.out.println(this.getClass().getSimpleName());

    }

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null, "空da");
//        map.put(null, null);
        Map table = new Hashtable();
//        table.put(null, "me too");
//        table.put(null, null);
        System.out.println(map.get(null));
        System.out.println(table);
    }
}
