package com.examples.factorial;

import com.google.common.math.BigIntegerMath;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorial {

    public static long factorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialUsingRecursion(n - 1));
        }
    }

    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
    }

    public static long factorialUsingApacheCommons(int n) {
        return CombinatoricsUtils.factorial(n);
    }

    public static BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger factorialUsingGuava(int n) {
        return BigIntegerMath.factorial(n);
    }
}
