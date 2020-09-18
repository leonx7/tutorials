package com.examples.creational.factorymethod;

//Concrete product #1
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
