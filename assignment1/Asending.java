package com.assignment1;

public class Asending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 7, 9, 4};

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

