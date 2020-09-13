package com.examples.creational.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EarlyInitSingletonUsingStaticBlockTest {
    private static final int SIZE = 100;
    private static int expectedValue;
    private static Thread[] singletons;

    @BeforeAll
    public static void initVariables() {
        expectedValue = 1;
        singletons = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            singletons[i] = new Thread(new EarlyInitSingletonUsingStaticBlockUtil());
            singletons[i].start();
        }
    }

    @Test
    void checkTheNumberOfInstances(){
        assertEquals(expectedValue, EarlyInitSingletonUsingStaticBlock.counter);
    }
}

class EarlyInitSingletonUsingStaticBlockUtil implements Runnable{

    @Override
    public void run() {
        EarlyInitSingletonUsingStaticBlock instance = EarlyInitSingletonUsingStaticBlock.instance;
    }
}

