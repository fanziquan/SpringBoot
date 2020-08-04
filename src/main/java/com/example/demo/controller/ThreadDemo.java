package com.example.demo.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author fanzq22858
 * @version $Id: ThreadDemo.java, v 0.1 2019/3/15 15:07 Exp $
 */
public class ThreadDemo implements Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask task = new FutureTask(new ThreadDemo());
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(Thread.currentThread().getName() + "主线程");
        System.out.println(task.get());
    }

    @Override
    public Object call() {
        System.out.println(Thread.currentThread().getName() + "执行了");
        return 1;
    }
}
