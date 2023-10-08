package com.shruti;

import java.util.Scanner;

public class AverageMarksOf5Sub {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks -:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int sum = a+b+c+d+e;
        System.out.println("Total marks = "+sum);
        double average = sum/5.0;
        System.out.println("Average marks = "+average);
    }
}
