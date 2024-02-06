package com.Interview;

/*
Problem Statement: Check if a given substring is present in the string.
 */
public class PresenceOfStringInSubString {

    private static boolean isPresent(String input, String subString){

        boolean flag=false;
/*
        for (int i=0; i<input.length();i++){

            if ()
        }

 */
        if (input.matches("(.*)" + subString + "(.*)")){

            flag=true;
        }

        return flag;
    }

    public static void main(String[] args) {

        boolean present = isPresent("Shubham Shankar Jagtap", " gta");
        System.out.println("is given substring is present in the given string?....." + present);

    }
}
