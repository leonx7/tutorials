package com.examples.fibonacci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSeriesUtilsTest {

    private static int term;
    private  static long expectedValue;

    @BeforeAll
    public static void initVariables(){
        term = 50;
        expectedValue = 12586269025L;
    }

    @Test
    void nthFibonacciTermRecursiveMethod() {
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermRecursiveMethod(term), expectedValue);
    }

    @Test
    void nthFibonacciTermCashingMethod() {
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermCashingMethod(term), expectedValue);
    }

    @Test
    void nthFibonacciTermIterativeMethod() {
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermIterativeMethod(term), expectedValue);
    }

    @Test
    void nthFibonacciTermUsingBinetsFormula() {
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermUsingBinetsFormula(term), expectedValue);
    }
}