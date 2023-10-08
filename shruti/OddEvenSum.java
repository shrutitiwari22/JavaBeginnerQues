package com.shruti;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        int n,i,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range = ");
        n = sc.nextInt();

        if (n%2==0){
            for (i=0; i<=n;i=i+2){
              sum = sum + i;
            }
            System.out.print("Sum of even numbers = "+sum);
        }
        else {
            for (i = 1; i<=n; i = i+2){
              sum = sum + i;
            }
            System.out.print("Sum of odd number is = "+sum);
        }
    }
}
