package com.examples.creational.factorymethod;

//Concrete product #2
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
