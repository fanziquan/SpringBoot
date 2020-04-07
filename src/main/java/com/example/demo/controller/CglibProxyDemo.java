package com.example.demo.controller;

import com.example.demo.proxy.HelloConcrete;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author :fanzq HW2120
 * @version : CglibProxyDemo.java, v 0.1 2020/4/6 15:52 Exp $
 * @description :
 */
public class CglibProxyDemo implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("sayHello".equals(method.getName())) {
            System.out.println(("You said: " + Arrays.toString(objects)));
        }
        return methodProxy.invokeSuper(o,objects);
    }


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new CglibProxyDemo());
        HelloConcrete helloConcrete = (HelloConcrete) enhancer.create();

        System.out.println(helloConcrete.sayHello("I love you!"));
    }
}
