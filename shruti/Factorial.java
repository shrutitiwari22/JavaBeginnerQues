// 5 --> 5*4*3*2*1 --> 120
package com.shruti;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,i,fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value = ");
        n = sc.nextInt();

        for (i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.print("Factorial = "+fact);

    }
}
