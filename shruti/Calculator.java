package com.shruti;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers = ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.print("Select operation ");
        ch = sc.nextInt();
        if (ch == 1){
          cal = n1 + n2;
            System.out.print("Addition "+cal);
        } else if (ch==2) {
            cal = n1 - n2;
            System.out.print("Subtraction "+cal);
        }
        else if (ch == 3) {
            cal = n1 * n2;
            System.out.print("Multiplication "+cal);
        }
        else if (ch == 4) {
            cal = n1/n2;
            System.out.print("Division "+cal);
        }
        else {
            cal = n1 % n2;
            System.out.print("Remainder "+cal);
        }
    }
}
