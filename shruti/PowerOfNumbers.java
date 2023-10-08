package com.shruti;

import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int n,p,result=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        n = sc.nextInt();
        System.out.print("Enter power = ");
        p = sc.nextInt();

        for (int i = 1; i <=p ; i++) {
            result = n*result;
        }
        System.out.println("Power = "+result);
    }
}
