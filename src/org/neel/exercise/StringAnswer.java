package org.neel.exercise;

public class StringAnswer {
    public static void main(String[] args) {
        // String concatenation
        String hello = "Hello";
        String world = "World!";

        String helloWorld = hello + " " + world;
        System.out.println(helloWorld);

        // Print all characters in a string
        for(int i = 0; i < helloWorld.length(); i++) {
            System.out.println(helloWorld.charAt(i));
        }

        // Count the number of a particular character in a string
        char c = 'o';
        int count = 0;
        for(int i = 0; i < helloWorld.length(); i++) {
            if(c == helloWorld.charAt(i)) {
                count++;
            }
        }

        System.out.println("Number of " + c + " in string " + helloWorld + " is " + count);
    }
}
