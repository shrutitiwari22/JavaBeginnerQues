package com.shruti;

import java.util.Scanner;

public class SphereArea {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius=sc.nextDouble();
        double surface_area = 4 * 3.14 * (radius * radius);
        double volume = ((double)4 / 3) * 3.14 * (radius * radius * radius);
        System.out.println("The surface area of the sphere = "+surface_area);
        System.out.println("The volume of sphere = "+volume);
    }

}
