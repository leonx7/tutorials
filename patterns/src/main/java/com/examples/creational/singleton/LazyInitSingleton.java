package com.examples.creational.singleton;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;
    public static int counter = 0;

    private LazyInitSingleton() {
        counter++;
    }

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}

