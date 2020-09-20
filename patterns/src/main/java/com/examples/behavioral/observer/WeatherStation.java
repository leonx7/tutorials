package com.examples.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurement(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserver(temperature, pressure);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(int temperature, int pressure) {
        for (Observer observer : observers) {
            observer.handleEvent(temperature, pressure);
        }
    }
}
