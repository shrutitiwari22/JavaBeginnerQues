package com.shruti;

import java.util.Scanner;

public class SumOfFirstNnaturalNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of terms = ");
        n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            sum = sum + i ; // 0 + i
        }
        System.out.print("Addition of terms is = "+sum);
    }
}
