package com.assignment1;

public class DuplicateNo {
    public static void main(String[] args) {
        int inputArray[] = new int[]{100, 500, 500, -200,
                1000, -213, 100};

        for (int i = 0; i < inputArray.length; i++) {
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[i]==inputArray[j]){
                    System.out.println("Duplicate no:"+inputArray[j]);
                }
            }
        }
    }
}
