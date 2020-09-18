package com.examples.creational.abstractfactory.transport;

public class Helicopter implements AirTransport{
    @Override
    public void fly() {
        System.out.println("Delivering by helicopter");
    }
}
