package com.assignment1;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 7, 9, 4};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest number in the array is " + secondLargest);
    }
}