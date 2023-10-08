package com.shruti;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        double r = sc.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("Area of circle = "+area);
    }
}
