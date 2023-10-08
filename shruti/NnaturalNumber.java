package com.shruti;

import java.util.Scanner;

public class NnaturalNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }
    }
}
