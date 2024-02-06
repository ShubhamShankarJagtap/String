package com.Intellij;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String input = scanner.nextLine();
        String newString=" ";

        for (int i=0; i<input.length();i++){
            char newChars = input.charAt(i);
            newString = newChars + input;
        }
        System.out.println("Reversed word " + newString);
    }
}
