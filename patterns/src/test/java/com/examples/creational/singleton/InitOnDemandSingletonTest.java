package com.examples.creational.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitOnDemandSingletonTest {
    private static final int SIZE = 100;
    private static int expectedValue;
    private static Thread[] singletons;

    @BeforeAll
    public static void initVariables() {
        expectedValue = 1;
        singletons = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            singletons[i] = new Thread(new InitOnDemandSingletonUtil());
            singletons[i].start();
        }
    }

    @Test
    void checkTheNumberOfInstances() {
        assertEquals(expectedValue, InitOnDemandSingleton.counter);
    }
}

class InitOnDemandSingletonUtil implements Runnable {

    @Override
    public void run() {
        InitOnDemandSingleton.getInstance();
    }
}
