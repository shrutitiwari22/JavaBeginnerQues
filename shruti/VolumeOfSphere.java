package com.shruti;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,result;
        System.out.println("Enter radius : ");
        r = sc.nextDouble();

        result = 4* (3.14 * r *r *r) / 3;
        System.out.println(result);
    }
}
