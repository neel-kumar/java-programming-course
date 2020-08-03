package org.neel.exercise;

public class FunctionAnswer {

    // A function which neither has input nor output.
    private static void NoArgNoReturn() {
        System.out.println("Hello World!");
    }

    // OneArg is a function which has one input and returns nothing.
    private static void OneArg(String msg) { System.out.println(msg); }

    // Write a function which returns an integer.
    private static int ret() {
        return 10 + 20;
    }

    // Write a funcion 'max' which takes an array of integers as an input and returns the max value in it.
    private static int max(int[] array) {
        int m = array[0];
        for(int i : array) {
            if(m < i) {
                m = i;
            }
        }
        return m;
    }

    // Implement a function named greater, which takes two integers as inputs
    // and returns greater of the two.
    private static int greater(int i, int j) {
        if(i < j) {
            return j;
        } else {
            return i;
        }
    }
}
