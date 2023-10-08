package com.shruti;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        int l, w, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle = ");
        l = sc.nextInt();
        System.out.print("Enter the width of rectangle = ");
        w = sc.nextInt();
        result = l*w;
        System.out.print("Area of rectangle = "+result);
    }
}
