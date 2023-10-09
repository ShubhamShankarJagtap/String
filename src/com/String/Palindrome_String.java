package com.String;

public class Palindrome_String {
    public static void main(String[] args) {

        String original = "MADAM";

        String reverse = "";

        int i = original.length()-1;

        while(i>=0){

            reverse = reverse + original.charAt(i);

            i--;
        }

        if(reverse.equals(original)){

            System.out.println("The " + original + " is a " + " palindrome String.");
        }
        else {
            System.out.println("The " + original + " is not a " + "palindrome String.");
        }


    }

}
