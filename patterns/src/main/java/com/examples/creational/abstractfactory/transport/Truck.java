package com.examples.creational.abstractfactory.transport;

public class Truck implements LandTransport{
    @Override
    public void go() {
        System.out.println("Delivering by truck");
    }
}
