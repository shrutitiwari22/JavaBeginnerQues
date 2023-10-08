package com.shruti;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers = ");
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.print("Before swapping "+a+ " "+b);
        //temp= sc.nextInt();

          temp = a;
          a = b;
          b = temp;
        System.out.print("After swapping "+a+ " "+b);
    }
}
