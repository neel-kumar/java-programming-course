package org.neel.app;

public class FactorialRecursionIterative {

    public static int iterativeFact(int factorialNum) {
        int factorial = 1;
        for(int i = 1; i <= factorialNum; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int recursiveFact(int factorialNum) {
        if(factorialNum <= 1) {
            return 1;
        }
        return factorialNum * recursiveFact(factorialNum-1);
    }

    public static void main(String[] args) {
        System.out.println(iterativeFact(4));
        System.out.println(recursiveFact(4));
    }
}
