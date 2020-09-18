package com.examples.creational.abstractfactory.transport;

public class Plane implements AirTransport {
    @Override
    public void fly() {
        System.out.println("Delivering by plane");
    }
}
