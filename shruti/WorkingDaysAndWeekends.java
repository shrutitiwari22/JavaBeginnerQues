package com.shruti;

import java.util.Scanner;

public class WorkingDaysAndWeekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Days = sc.next();

        switch (Days){
            case "Monday" -> System.out.println("Its office day");
            case "Tuesday"-> System.out.println("Its  office day");
            case "Wednesday"-> System.out.println("Today's work from home day");
            case "Thursday"-> System.out.println("Its office day ");
            case "Friday"-> System.out.println("Today's work from home day ");
            case "Saturday"-> System.out.println("Its weekend");
            case "Sunday"-> System.out.println("Weekend ");





        }

    }
}
