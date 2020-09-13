package com.examples.creational.singleton;

public class DCLSingleton {
    private static volatile DCLSingleton instance;
    public static int counter = 0;

    private DCLSingleton() {
        counter++;
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null)
                    instance = new DCLSingleton();
            }
        }
        return instance;
    }
}
