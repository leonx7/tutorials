package com.examples.creational.builder;

import static com.examples.creational.builder.Transmission.AUTO;

public class BuilderApp {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder
                .buildModel("BMW")
                .buildTransmission(AUTO)
                .buildMaxSpeed(220)
                .buildCar();
        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new RenaultBuilder());
        Car car1 = director.createCar();
        System.out.println(car1);
    }
}
