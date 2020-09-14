package com.examples.creational.singleton;

public class InitOnDemandSingleton {
    public static int counter = 0;

    private static class InstanceHolder {

        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }

    private InitOnDemandSingleton() {
        counter++;
    }

    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
