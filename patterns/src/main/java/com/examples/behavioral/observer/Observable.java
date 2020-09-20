package com.examples.behavioral.observer;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(int temperature, int pressure);
}
