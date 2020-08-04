package com.example.demo.controller;

import java.util.concurrent.SynchronousQueue;

/**
 * @author :fanzq HW2120
 * @version : StringDemo.java, v 0.1 2020/6/1 10:44 Exp $
 * @description :
 */
public class StringDemo {

    public static void main(String[] args) {
        String s1 = "疯狂的java";//字符串池缓存了一个字符串"疯狂的java"
        String s2 = "疯狂的" + "java";//编译时就确定了值为"疯狂的java",所以直接指向字符串池中的缓存字符串"疯狂的java",此时s1 跟 s2 的内存地址是一样的
        System.out.println(s1 == s2);
        //定义2个字符串直接量
        String str1 = "疯狂的";
        String str2 = "java";
        //将str1和str2进行连接运算
        String s3 = str1 + str2;//使用了普通变量,所以编译时无法确定值,在运行时，在内存独自开一块内存空间,存储值.此时的s3内存地址是跟s1不一样的
        System.out.println(s1 == s3);


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
