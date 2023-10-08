package com.shruti;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number = ");
        n = sc.nextInt();

        if (n==1){
            System.out.println("Jan = 31days");
        }
        else if (n==2) {
            System.out.println("Feb = 29days");
        }
        else if (n==3) {
            System.out.println("March = 31days");
        }
        else if (n==4) {
            System.out.println("April = 30days");
        }
        else if (n==5) {
            System.out.println("May = 31days");
        }
        else if (n==6) {
            System.out.println("June = 30days");
        }
        else if (n==7) {
            System.out.println("July = 31days");
        }
        else if (n==8) {
            System.out.println("August = 31days");
        }
        else if (n==9) {
            System.out.println("September = 30days");
        }
        else if (n==10) {
            System.out.println("October = 31days");
        }
        else if (n==11) {
            System.out.println("November = 30days");
        }
        else if (n==12) {
            System.out.println("December = 31days");
        }
        else {
            System.out.println("Enter valid month number");
        }
    }
}
