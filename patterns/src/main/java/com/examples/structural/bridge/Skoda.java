package com.examples.structural.bridge;

public class Skoda implements Make {
    @Override
    public void setMake() {
        System.out.println("Skoda");
    }
}
