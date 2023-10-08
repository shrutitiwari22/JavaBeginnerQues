package com.shruti;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,h,result;
        System.out.println("Enter 1st value = ");
        a = sc.nextFloat();
        System.out.println("Enter 2nd value = ");
        b = sc.nextFloat();
        System.out.println("Enter 3rd value = ");
        h = sc.nextFloat();
        result = (a+b)/2*h;
        System.out.println("Area of trapezoid = "+result);
    }



}
