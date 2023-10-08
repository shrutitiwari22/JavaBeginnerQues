package com.shruti;

import java.util.Scanner;

public class VolumeOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, h;
        System.out.print("Enter length : ");
        l = sc.nextInt();
        System.out.print("Enter breadth : ");
        b = sc.nextInt();
        System.out.print("Enter height : ");
        h = sc.nextInt();
        int result = l * b * h;
        System.out.println("Volume of cuboid is = "+result);

    }
}
