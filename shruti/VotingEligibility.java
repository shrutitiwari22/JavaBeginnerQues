package com.shruti;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age = ");
        age = sc.nextInt();

        if (age >= 18){
            System.out.print("Eligible for voting");
        }
        else {
            System.out.print("Not eligible for voting");
        }
    }
}
