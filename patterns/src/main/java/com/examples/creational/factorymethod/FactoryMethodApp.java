package com.examples.creational.factorymethod;

public class FactoryMethodApp {
    public static void main(String[] args) {
        Logistics logistics = getLogisticsByName("road");
        Logistics logistics2 = getLogisticsByName("sea");

        Transport transport = logistics.createTransport();
        Transport transport2 = logistics2.createTransport();

        transport.deliver();
        transport2.deliver();
    }

    public static Logistics getLogisticsByName(String name) {
        if (name.equals("road")) {
            return new RoadLogistics();
        } else if (name.equals("sea")) {
            return new SeaLogistics();
        } else
            throw new RuntimeException("This logistics is not supported");
    }
}
