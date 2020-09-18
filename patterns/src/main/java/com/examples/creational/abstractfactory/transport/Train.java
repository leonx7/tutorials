package com.examples.creational.abstractfactory.transport;

public class Train implements LandTransport{
    @Override
    public void go() {
        System.out.println("Delivering by train");
    }
}
