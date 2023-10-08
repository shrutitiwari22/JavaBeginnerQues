// century (100%==0 and 400%=0)
// yearly (100%!=0 and 4%=0)
package com.shruti;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year = ");
        y = sc.nextInt();

        if (y%100 == 0 && y%400 == 0 || y%100!=0 && y%4==0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not leap year");
        }

    }
}
