package com.examples.creational.abstractfactory.transport;

public class Submarine implements SeaTransport{
    @Override
    public void sail() {
        System.out.println("Delivering by submarine");
    }
}
