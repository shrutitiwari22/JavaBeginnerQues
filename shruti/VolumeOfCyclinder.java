package com.shruti;

import java.util.Scanner;

public class VolumeOfCyclinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,h,result;
        System.out.println("Enter radius : ");
        r = sc.nextDouble();
        System.out.println("Enter height : ");
        h = sc.nextDouble();

        result = 3.14 * r *r *h;
        System.out.println(result);
    }
}
