package com.examples.creational.builder;

public abstract class AbstractBuilder {
    Car car;

    public void createCar() {
        car = new Car();
    }

    abstract void buildModel();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    public Car getCar() {
        return car;
    }
}
