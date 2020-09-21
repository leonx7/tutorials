package com.examples.structural.bridge;

public abstract class Car {
    Make make;

    abstract void showType();

    public void showDetails() {
        showType();
        make.setMake();
    }
}
