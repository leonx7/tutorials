package com.examples.factorial;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    private static int number;
    private static long expectedValue;

    @BeforeAll
    public static void initVariables() {
        number = 9;
        expectedValue = 362880;
    }

    @Test
    void factorialUsingRecursion() {
        assertEquals(Factorial.factorialUsingRecursion(number), expectedValue);
    }

    @Test
    void factorialUsingStreams() {
        assertEquals(Factorial.factorialUsingStreams(number), expectedValue);
    }

    @Test
    void factorialUsingApacheCommons() {
        assertEquals(Factorial.factorialUsingApacheCommons(number), expectedValue);
    }

    @Test
    void factorialHavingLargeResult() {
        assertEquals(Factorial.factorialHavingLargeResult(number), BigInteger.valueOf(expectedValue));
    }

    @Test
    void factorialUsingGuava() {
        assertEquals(Factorial.factorialUsingGuava(number), BigInteger.valueOf(expectedValue));
    }
}