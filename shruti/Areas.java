package com.shruti;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Parallelogram

        int b, h;
        System.out.print("Enter breadth = ");
        b = sc.nextInt();
        System.out.print("Enter height = ");
        h = sc.nextInt();
        int result = b * h;
        System.out.print("Area of parallelogram = "+result);

    }
}