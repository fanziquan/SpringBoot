package com.example.demo.proxy;

/**
 * @author :fanzq HW2120
 * @version : Hello.java, v 0.1 2020/4/6 14:57 Exp $
 * @description : 动态代理
 */
public interface Hello {
    /**
     * 接口方法
     * @param str
     * @return
     */
    String sayHello(String str);


    // 实现
    class HelloImp implements Hello{
        @Override
        public String sayHello(String str) {
            return "HelloImp: " + str;
        }
    }
}
