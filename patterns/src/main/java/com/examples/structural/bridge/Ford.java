package com.examples.structural.bridge;

public class Ford implements Make {
    @Override
    public void setMake() {
        System.out.println("Ford");
    }
}
