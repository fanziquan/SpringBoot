package com.example.demo.controller;

import com.example.demo.proxy.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author :fanzq HW2120
 * @version : JdkProxyDemo.java, v 0.1 2020/4/6 15:04 Exp $
 * @description : JDK代理实现
 */
public class JdkProxyDemo implements InvocationHandler {

    private Hello hello;

    public JdkProxyDemo(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("sayHello".equals(method.getName())) {
            System.out.println(("You said: " + Arrays.toString(args)));
        }
        return method.invoke(hello, args);
    }

    public static void main(String[] args) {
        Hello hello = (Hello) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Hello.class}, new JdkProxyDemo(new Hello.HelloImp()));
        System.out.println(hello.sayHello("I love you"));
    }
}
