package com.examples.behavioral.observer;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new ConsoleObserver());
        weatherStation.addObserver(new FileObserver());
        weatherStation.setMeasurement(21, 730);
        weatherStation.setMeasurement(19, 690);
    }
}
