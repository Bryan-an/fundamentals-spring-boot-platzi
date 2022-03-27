package com.fundamentalsplatzi.springboot.fundamentals.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("We've entered to the printWithDependency method");
        int number = 1;
        LOGGER.debug("The number sent as parameter of the operation dependency is: " + number);
        System.out.println(myOperation.sum(number));
        System.out.println("Hello from the implementation of a bean with dependency");
    }
}
