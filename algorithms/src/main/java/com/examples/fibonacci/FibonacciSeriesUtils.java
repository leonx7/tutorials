package com.examples.fibonacci;

public class FibonacciSeriesUtils {

    public static int nthFibonacciTermRecursiveMethod(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (nthFibonacciTermRecursiveMethod(n - 1) + nthFibonacciTermRecursiveMethod(n - 2));
    }

    private static int nthFibonacciTermCashingMethodUtil(int n, int[] f) {

        if (f[n] == -1) {
            f[n] = (nthFibonacciTermCashingMethodUtil(n - 1, f) + nthFibonacciTermCashingMethodUtil(n - 2, f));
        }
        return f[n];
    }

    public static int nthFibonacciTermCashingMethod(int n) {
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = -1;
        }
        return nthFibonacciTermCashingMethodUtil(n, f);
    }

    public static int nthFibonacciTermIterativeMethod(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int n0 = 0, n1 = 1;
        int tempNthTerm = 0;
        for (int i = 2; i <= n; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }
        return tempNthTerm;
    }

    public static int nthFibonacciTermUsingBinetsFormula(int n) {
        double squareRoutOf5 = Math.sqrt(5);
        double phi = (1 + squareRoutOf5) / 2;
        return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / squareRoutOf5);
    }
}
