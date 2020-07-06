package com.examples.factorial;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialUsingRecursion() {
        int number = 9;
        long expectedValue = 362880;
        assertEquals(Factorial.factorialUsingRecursion(number), expectedValue);
    }

    @Test
    void factorialUsingStreams() {
        int number = 9;
        long expectedValue = 362880;
        assertEquals(Factorial.factorialUsingStreams(number), expectedValue);
    }

    @Test
    void factorialUsingApacheCommons() {
        int number = 9;
        long expectedValue = 362880;
        assertEquals(Factorial.factorialUsingApacheCommons(number), expectedValue);
    }

    @Test
    void factorialHavingLargeResult() {
        int number = 9;
        BigInteger expectedValue = BigInteger.valueOf(362880);
        assertEquals(Factorial.factorialHavingLargeResult(number), expectedValue);
    }

    @Test
    void factorialUsingGuava() {
        int number = 9;
        BigInteger expectedValue = BigInteger.valueOf(362880);
        assertEquals(Factorial.factorialUsingGuava(number), expectedValue);
    }
}