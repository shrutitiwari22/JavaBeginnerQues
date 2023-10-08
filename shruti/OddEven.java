package com.shruti;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
        if (num % 2 ==0){
            System.out.print("This number is even");
        }
        else
        {
            System.out.print("This number is odd");
        }
    }
}