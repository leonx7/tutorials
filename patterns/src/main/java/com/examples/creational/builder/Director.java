package com.examples.creational.builder;

public class Director {
    AbstractBuilder builder;

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Car createCar() {
        builder.createCar();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        return builder.getCar();
    }
}
