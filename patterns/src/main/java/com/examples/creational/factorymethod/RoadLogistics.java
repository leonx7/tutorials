package com.examples.creational.factorymethod;

// Concrete creator #1
public class RoadLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
