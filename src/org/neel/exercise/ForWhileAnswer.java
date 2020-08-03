package org.neel.exercise;

public class ForWhileAnswer {
    public static void main(String[] args) {
        // Print 1, 2, 3, 4, 5 each on different lines using For Loops and While Loops
        // For Loop
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // While Loop
        int j = 1;
        while(j <= 5) {
            System.out.println(j);
            j++;
        }

        // Print 1, 3, 5 each on different lines using For Loops and While Loops

        //Method 2

        // For Loop
        for(int i = 1; i <= 5; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
        // While Loop
        j = 1;
        while(j <= 5) {
            if(j % 2 == 1) {
                System.out.println(j);
            }
            j++;
        }

        // Method 1

        // For Loop
        for(int i = 1; i <= 5; i = i + 2) {
            System.out.println(i);
        }

        // While Loop
        j = 1;
        while(j <= 5) {
            System.out.println(j);
            j = j + 2;
        }
    }
}
