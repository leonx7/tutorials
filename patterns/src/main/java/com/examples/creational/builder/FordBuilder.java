package com.examples.creational.builder;

import static com.examples.creational.builder.Transmission.AUTO;

public class FordBuilder extends AbstractBuilder {
    @Override
    void buildModel() {
        car.setModel("Ford");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
