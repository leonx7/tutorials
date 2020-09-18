package com.examples.creational.factorymethod;

// Concrete creator #2
public class SeaLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
