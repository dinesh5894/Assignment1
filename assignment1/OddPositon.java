package com.assignment1;


public class OddPositon {

    public static void main(String[] args) {
        // Initialized array
        int inputArray[] = new int[]{103, -500, 450, -200,
                1000, -213, 750};

        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println(inputArray[i]);


            }
        }
    }

}