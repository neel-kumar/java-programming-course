package org.neel.exercise;

public class ArrayIndexingAnswers {
    public static void main(String[] args) {
        int[] l = {2,4,6,8,10};
        // Print the 1st element of l
        System.out.println(l[0]);

        // Print the 3rd element of l
        System.out.println(l[2]);

        // Print the last element of l
        // HINT: find out length of l
        // This has to work for any list
        System.out.println(l[l.length-1]);
    }
}
