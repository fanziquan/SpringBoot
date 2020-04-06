package com.example.demo.controller;

/**
 * @author fanzq22858
 * @version $Id: ThreadDamo.java, v 0.1 2019/3/15 15:07 Exp $
 */
public class ThreadDamo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadDamo()).start();

    }
}
