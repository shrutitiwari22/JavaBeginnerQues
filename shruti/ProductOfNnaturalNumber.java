package com.shruti;

import java.util.Scanner;

public class ProductOfNnaturalNumber {
    public static void main(String[] args) {
        int n, product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms = ");
        n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
             product = product * i;
        }
        System.out.print("RESULT = "+product);
    }
}
