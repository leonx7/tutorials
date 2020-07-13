package com.examples.fibonacci;

public class FibonacciSeriesUtils {

    //The complexity of the algorithm О(Ф^n);
    public static long nthFibonacciTermRecursiveMethod(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (nthFibonacciTermRecursiveMethod(n - 1) + nthFibonacciTermRecursiveMethod(n - 2));
    }

    private static long nthFibonacciTermCashingMethodUtil(int n, long[] f) {

        if (f[n] == -1) {
            f[n] = (nthFibonacciTermCashingMethodUtil(n - 1, f) + nthFibonacciTermCashingMethodUtil(n - 2, f));
        }
        return f[n];
    }

    //The complexity of the algorithm О(N);
    public static long nthFibonacciTermCashingMethod(int n) {
        long[] f = new long[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = -1;
        }
        return nthFibonacciTermCashingMethodUtil(n, f);
    }

    //The complexity of the algorithm О(N);
    public static long nthFibonacciTermIterativeMethod(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        long n0 = 0, n1 = 1;
        long tempNthTerm = 0;
        for (int i = 2; i <= n; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }
        return tempNthTerm;
    }

    //The complexity of the algorithm О(1);
    public static long nthFibonacciTermUsingBinetsFormula(int n) {
        double squareRoutOf5 = Math.sqrt(5);
        double phi = (1 + squareRoutOf5) / 2;
        return (long) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / squareRoutOf5);
    }

    public static void main(String[] args) {

        long startTime1 = System.nanoTime();
        nthFibonacciTermUsingBinetsFormula(10);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println("Duration 1: " + duration1);

        long startTime2 = System.nanoTime();
        nthFibonacciTermUsingBinetsFormula(50);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println("Duration 2: " + duration2);
    }
}
