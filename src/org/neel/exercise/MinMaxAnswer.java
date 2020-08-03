package org.neel.exercise;

public class MinMaxAnswer {
    public static void main(String[] args) {
        int[] array = {1, 2, 10, 5, 6, -1, 7};

        // Find min
        int min = array[0];
        for(int i: array) {
            if(i < min) {
                min = i;
            }
        }

        System.out.println("Min is " + min);

        // Find max
        int max = array[0];
        for(int i: array) {
            if(i > max) {
                max = i;
            }
        }

        System.out.println("Max is " + max);
    }
}
