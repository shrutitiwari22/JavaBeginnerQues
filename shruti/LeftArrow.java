package com.shruti;

public class LeftArrow {
    public static void main(String[] args) {
        // left pasal triangle
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < size - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
