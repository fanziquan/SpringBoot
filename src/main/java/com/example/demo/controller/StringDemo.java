package com.example.demo.controller;

import java.util.concurrent.SynchronousQueue;

/**
 * @author :fanzq HW2120
 * @version : StringDemo.java, v 0.1 2020/6/1 10:44 Exp $
 * @description :
 */
public class StringDemo {

    public static void main(String[] args) {

        SynchronousQueue<String> queue = new SynchronousQueue<>();
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    queue.put("put"+ finalI);
                    System.out.println("put"+ finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println("take"+ queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
