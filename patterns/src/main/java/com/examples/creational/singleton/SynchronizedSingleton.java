package com.examples.creational.singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    public static int counter = 0;

    private SynchronizedSingleton() {
        counter++;
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
