package com.examples.creational.builder;

import static com.examples.creational.builder.Transmission.MANUAL;

//Builder
public class CarBuilder {
    private String model = "default";
    private Transmission transmission = MANUAL;
    private int maxSpeed = 180;

    public CarBuilder buildModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car buildCar() {
        Car car = new Car();
        car.setModel(model);
        car.setMaxSpeed(maxSpeed);
        car.setTransmission(transmission);
        return car;
    }
}
