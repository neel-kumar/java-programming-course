package org.neel.exercise;

public class EvenOrOddAnswer {
    public static void main(String[] args) {
        /* Write a program that checks if x is even or odd
           If x is even print even
           If x is odd print odd
           Note: This should work no matter what x is
         */
        int x = 137;

        if(x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Can you do this just using at least 1 if statement without an else?
        // HINT: Use a boolean

        boolean isEven = true;
        if(x % 2 != 0) {
            isEven = false;
        }

        if(isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
