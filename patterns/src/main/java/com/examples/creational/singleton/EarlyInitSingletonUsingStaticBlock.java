package com.examples.creational.singleton;

public class EarlyInitSingletonUsingStaticBlock {
    public static EarlyInitSingletonUsingStaticBlock instance;
    public static int counter = 0;

    private EarlyInitSingletonUsingStaticBlock() {
        counter++;
    }

    static {
        instance = new EarlyInitSingletonUsingStaticBlock();
    }
}
