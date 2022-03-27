package com.fundamentalsplatzi.springboot.fundamentals.bean;

public class MyBeanImplement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hello from my own bean implementation");
    }
}
