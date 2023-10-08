package com.shruti;

import java.util.Scanner;

public class squareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a,b,result;
        System.out.print("Enter 1st side = ");
        a = sc.nextFloat();
        System.out.print("Enter 2nd side = ");
        b = sc.nextFloat();
        result = a*b;
        System.out.println("Area of square = "+result);
    }
}
