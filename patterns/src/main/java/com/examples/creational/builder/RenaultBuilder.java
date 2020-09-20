package com.examples.creational.builder;

import static com.examples.creational.builder.Transmission.MANUAL;

public class RenaultBuilder extends AbstractBuilder {
    @Override
    void buildModel() {
        car.setModel("Renault");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);
    }
}
