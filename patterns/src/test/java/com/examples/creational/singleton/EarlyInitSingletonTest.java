package com.examples.creational.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EarlyInitSingletonTest {
    private static final int SIZE = 100;
    private static int expectedValue;
    private static Thread[] singletons;

    @BeforeAll
    public static void initVariables() {
        expectedValue = 1;
        singletons = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            singletons[i] = new Thread(new EarlyInitSingletonUtil());
            singletons[i].start();
        }
    }

    @Test
    void checkTheNumberOfInstances() {
        assertEquals(expectedValue, EarlyInitSingleton.counter);
    }
}

class EarlyInitSingletonUtil implements Runnable {

    @Override
    public void run() {
        EarlyInitSingleton instance = EarlyInitSingleton.getInstance();
    }
}