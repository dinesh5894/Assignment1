package com.assignment1;

public class SmallestNo {

    public static void main(String[] args)
    {
        int arr[] = {10, 324, 45000, 90, 9808};
        int i;


        int min = arr[0];


        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];


        }

        System.out.println("Smallest in given array is " +min);
    }
}