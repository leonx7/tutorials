package com.examples.creational.abstractfactory.transport;

public class Ship implements SeaTransport{
    @Override
    public void sail() {
        System.out.println("Delivering by ship");
    }
}
