package com.shruti;

import java.util.Scanner;

public class GreatestBetween2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers = ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.print("Greatest number = "+num1);
        }
        else{
            System.out.print("Greatest number = "+num2);
        }
    }
}
