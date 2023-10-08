package com.shruti;

import java.util.Scanner;

public class PersonHeight {
    public static void main(String args[])
    {
        int m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height:");
        m = s.nextInt();
        if(m > 175)
        {
            System.out.println("The person is tall.");
        }
        else if(m > 155 && m <= 175)
        {
            System.out.println("The person has average height.");
        }
        else
        {
            System.out.println("The person is short.");
        }
    }
}
