package com.shruti;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        n = sc.nextInt();

        if (n > 0){
            System.out.println("This number is positive");
        } else if (n < 0) {
            System.out.println("This number is negative");
        }
        else {
            System.out.println("This number is neither positive nor negative");
        }
    }
}
