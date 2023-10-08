package com.shruti;

public class checkString {

        public static void main(String[] args) {

            // create null, empty, and regular strings
            String str1 = null;
            String str2 = "";
            String str3 = "  ";


            System.out.println("str1 is " + isNullEmpty(str1));

            System.out.println("str2 is " + isNullEmpty(str2));

            System.out.println("str3 is " + isNullEmpty(str3));
        }

        // method check if string is null or empty
        public static String isNullEmpty(String str) {

            // check if string is null
            if (str == null) {
                return "NULL";
            }


            else if(str.isEmpty()){
                return "EMPTY";
            }

            else {
                return "neither NULL nor EMPTY";
            }
        }
    }

