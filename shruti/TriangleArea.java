package com.shruti;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float b,h,result;
        System.out.println("Enter breadth = ");
        b = sc.nextFloat();
        System.out.println("Enter height = ");
        h = sc.nextFloat();
        result = (b*h)/2;
        System.out.println("Area of triangle = "+result);

    }
}
