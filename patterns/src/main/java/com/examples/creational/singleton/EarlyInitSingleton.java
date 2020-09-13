package com.examples.creational.singleton;

public class EarlyInitSingleton {
    public static int counter = 0;
    private static final EarlyInitSingleton instance = new EarlyInitSingleton();

    private EarlyInitSingleton() {
        counter++;
    }

    public static EarlyInitSingleton getInstance() {
        return instance;
    }
}
