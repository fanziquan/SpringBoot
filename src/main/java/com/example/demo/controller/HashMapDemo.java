package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :fanzq HW2120
 * @version : HashMapDemo.java, v 0.1 2020/05/11 22:16 Exp $
 * @description :
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        map.put(1,1);
        map.put(1,3);
        map.put(17,2);
    }
}
