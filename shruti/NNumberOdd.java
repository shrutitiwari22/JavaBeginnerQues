package com.shruti;

import java.util.Scanner;

public class NNumberOdd {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms = ");
        n = sc.nextInt();

        for (int i = 1; i <=n ; i=i+2) { //i=1
            System.out.println(i+" ");
        }
    }
}
