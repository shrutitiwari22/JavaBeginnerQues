package com.shruti;

import java.util.Scanner;

public class Ellipse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b, result;
        System.out.print("Enter 1st side = ");
        a = sc.nextFloat();
        System.out.print("Enter 2nd side = ");
        b = sc.nextFloat();
        result = (22*a*b)/7;
        System.out.print(result);

    }
}
