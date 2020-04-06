package com.example.demo.adapter;

/**
 * @author fanzq22858
 * @version $Id: Wrapper.java, v 0.1 2018/11/30 15:31 Exp $
 */
public class Wrapper implements TargetTable{

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
