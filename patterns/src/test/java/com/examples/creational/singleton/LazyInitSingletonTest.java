package com.examples.creational.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyInitSingletonTest {
    private static int SIZE = 100;
    private static int expectedValue;
    private static LazyInitSingleton[] singletons;

    @BeforeAll
    public static void initVariables() {
        expectedValue = 1;
        singletons = new LazyInitSingleton[SIZE];
        for (int i = 0; i < SIZE; i++) {
            singletons[i] = LazyInitSingleton.getInstance();
        }
    }

    @Test
    void checkTheNumberOfInstances() {
        assertEquals(LazyInitSingleton.counter, expectedValue);
    }
}

