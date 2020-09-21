package com.examples.structural.bridge;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Sedan(new Skoda());
        car.showDetails();
        car = new Hatchback(new Ford());
        car.showDetails();
    }
}
