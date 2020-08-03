package org.neel.exercise;

public class BreakAndContinueAnswer {
    public static void main(String[] args) {
        // Print 1, 3, 5 each on different lines using For Loops and While Loops

        // For Loop
        for(int i = 1; i <= 5; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // While Loop
        int j = 1;
        while(j <= 5) {
            if(j % 2 == 0) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }

        // Find a number in a list
        int list[] = {1, 2, 3, 10, 100};

        // For Loop
        int find = 10;
        for(int i: list) {
            if(i == find) {
                System.out.println("Found the number!");
                break;
            }
        }

        // While Loop
        int i = 0;
        while(i < list.length) {
            if(list[i] == find) {
                System.out.println("Found the number!");
                break;
            }
            i++;
        }
    }
}
