package com.shruti;

public class Join2Strings {
    public static void main(String[] args) {


        String first = "Java ";
        System.out.println("First String: " + first);


        String second = "Programming";
        System.out.println("Second String: " + second);

        
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }
}
