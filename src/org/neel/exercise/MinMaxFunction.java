package org.neel.exercise;

public class MinMaxFunction {

    public static int min(int[] a) {
        int min = a[0];
        for(int i: a) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }

    public static double min(double[] a) {
        double min = a[0];
        for(double i: a) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {1,7,3,-2,12};
        double[] array2 = {2.5,3.7,-1.0,7.1};

        System.out.println(min(array1));
        System.out.println(min(array2));
    }
}
