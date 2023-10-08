package com.shruti;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int num;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number = ");
        num = sc.nextInt();

        for (int i = 1;i<=10; i++) {
         // num = num * i;
            System.out.println(num+" * "+i+" = "+ num * i);
        }
    }
}
