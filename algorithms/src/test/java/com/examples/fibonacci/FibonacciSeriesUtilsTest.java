package com.examples.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSeriesUtilsTest {

    @Test
    void nthFibonacciTermRecursiveMethod() {
        int term = 10;
        int expectedValue = 55;
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermRecursiveMethod(term), expectedValue);
    }

    @Test
    void nthFibonacciTermCashingMethod() {
        int term = 10;
        int expectedValue = 55;
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermCashingMethod(term), expectedValue);
    }

    @Test
    void nthFibonacciTermIterativeMethod() {
        int term = 10;
        int expectedValue = 55;
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermIterativeMethod(term), expectedValue);
    }

    @Test
    void nthFibonacciTermUsingBinetsFormula() {
        int term = 10;
        int expectedValue = 55;
        assertEquals(FibonacciSeriesUtils.nthFibonacciTermUsingBinetsFormula(term), expectedValue);
    }
}