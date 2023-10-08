// input salary <= 10000 -------> No tax
// input salary >10000 b/t salary<= 1000000 ------------> 10% tax
// input salary > 1000000 -----------> 20% tax

package com.shruti;

import java.util.Scanner;

public class TaxOfSalary {
    public static void main(String[] args) {
        int sal; double tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary = ");
        sal = sc.nextInt();

        if (sal <= 10000){
            System.out.print(sal+ " No tax");
        }
        else if (sal<= 1000000) {
                tax = sal*0.10;
            System.out.print(sal+" "+tax);
        }
        else {
            tax = sal*0.20;
            System.out.print(sal+" "+tax);
        }
    }
}
