package com.shruti;

public class LargestNoInArray {
    public static void main(String[] args) {


        int [] arr = new int [] {3, 8, 1, 12, 7, 99};

        int smallestElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < smallestElement)
                smallestElement = arr[i];
        }
        System.out.println("Smallest element of given array: " + smallestElement);
    }
}
