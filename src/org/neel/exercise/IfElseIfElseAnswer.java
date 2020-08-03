package org.neel.exercise;

public class IfElseIfElseAnswer {
    public static void main(String[] args) {
        // Check if a number is between 5 and 10
        int a = 6;

        if(a < 5) {
            // Do nothing
        } else if(a > 10) {
            // Do nothing
        } else {
            System.out.println("Number is between 5 and 10.");
        }

        if(a >= 5 && a <= 10) {
            System.out.println("Number is between 5 and 10.");
        }
    }
}
