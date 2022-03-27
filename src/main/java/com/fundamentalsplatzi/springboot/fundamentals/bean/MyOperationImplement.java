package com.fundamentalsplatzi.springboot.fundamentals.bean;

public class MyOperationImplement implements MyOperation {
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
