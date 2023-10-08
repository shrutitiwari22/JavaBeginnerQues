package com.shruti;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, perimeter;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius of circle:");
        r = sc.nextInt();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:" + perimeter);

    }
}