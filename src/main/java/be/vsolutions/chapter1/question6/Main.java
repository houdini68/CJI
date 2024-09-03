package be.vsolutions.chapter1.question6;

import java.math.BigInteger;

public class Main {
    /*
     * 6. Write a program that computes the factorial n! = 1 × 2 × ... × n, using BigInteger.
     * Compute the factorial of 1000.
     */
    final static int N = 2;

    public static void main(String[] args) {
        System.out.println(fact(1000));
    }

    static BigInteger fact(int n) {
        if (n == 0 || n == 1) return BigInteger.valueOf(1);
        if (n == 2) return BigInteger.valueOf(2);
        BigInteger result = BigInteger.valueOf(2);
        for (int i = 3; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
