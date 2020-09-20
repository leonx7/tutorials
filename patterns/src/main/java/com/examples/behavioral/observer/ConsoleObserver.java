package com.examples.behavioral.observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("The weather has changed: temperature = " + temperature + ", pressure = " + pressure + ";");
    }
}
