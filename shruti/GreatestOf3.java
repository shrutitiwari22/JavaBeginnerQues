package com.shruti;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args) {
       int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        a = sc.nextInt();
        System.out.print("Enter num2 = ");
        b = sc.nextInt();
        System.out.print("Enter num3 = ");
        c = sc.nextInt();

        if (a>b){
            if (a>c){
                System.out.print(a);
            }
            else {
                System.out.print(c);
            }
        }
        else {
            if (b>c){
                System.out.print(b);
            }
            else {
                System.out.print(c);
            }
        }
    }
}
