package com.examples.structural.bridge;

public class Hatchback extends Car {
    public Hatchback(Make make) {
        this.make = make;
    }

    @Override
    void showType() {
        System.out.print("Hatchback ");
    }
}
