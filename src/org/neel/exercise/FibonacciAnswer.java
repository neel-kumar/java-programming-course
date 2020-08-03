package org.neel.exercise;

public class FibonacciAnswer {

    // Write a recursive function to calculate Nth fibonacci number.
    private static long fibr(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibr(n - 1) + fibr(n - 2);
        }
    }

    // Write an function to calculate Nth fibonacci number iteratively.
    private static long fibi(int n) {
        long f2 = 0;
        long f1 = 1;

        if (n == 0) {
            return f2;
        } else if (n == 1) {
            return f1;
        } else {
            long f = 0;
            for(int i = 2; i <= n; i++) {
                f = f1 + f2;
                f2 = f1;
                f1 = f;
            }
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibr(5));
        System.out.println(fibi(50));

        // System.out.println(fibr(50)); // This may take forever in your computer, how can it be so slow!
    }
}
