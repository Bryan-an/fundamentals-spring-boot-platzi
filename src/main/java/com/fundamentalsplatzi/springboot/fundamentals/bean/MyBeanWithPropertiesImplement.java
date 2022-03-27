package com.fundamentalsplatzi.springboot.fundamentals.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties {

    private String name;
    private String lastName;

    public MyBeanWithPropertiesImplement(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String function() {
        return name + "-" + lastName;
    }
}
