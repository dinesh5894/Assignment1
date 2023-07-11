package com.assignment1;

public class LargestNo {
    public static void main(String[] args)
    {
        int arr[] = {10, 324, 45000, 90, 9808};
        int i;


        int max = arr[0];


        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];


        }

        System.out.println("Largest in given array is " +max);
    }
}