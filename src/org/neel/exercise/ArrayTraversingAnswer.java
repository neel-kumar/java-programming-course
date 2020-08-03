package org.neel.exercise;

public class ArrayTraversingAnswer {
    public static void main(String[] args) {
        // Print every element in list
        int[] list = {1, 2, 3, 4, 5};

        for(int i = 0; i < list.length; i = i + 1) {
            System.out.println(list[i]);
        }

        for(int i: list) {
            System.out.println(i);
        }
    }
}
