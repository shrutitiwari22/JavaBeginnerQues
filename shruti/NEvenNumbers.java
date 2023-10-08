package com.shruti;

import java.util.Scanner;

public class NEvenNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms = ");
        n = sc.nextInt();

        for (int i = 0; i <=n ; i=i+2) { // i=0
            System.out.print(i + " ");
        }
    }
}
