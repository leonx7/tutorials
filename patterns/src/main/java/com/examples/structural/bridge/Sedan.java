package com.examples.structural.bridge;

public class Sedan extends Car {
    public Sedan(Make make) {
        this.make = make;
    }

    @Override
    void showType() {
        System.out.print("Sedan ");
    }
}
