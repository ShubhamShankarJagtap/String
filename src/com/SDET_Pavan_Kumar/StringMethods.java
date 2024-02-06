package com.SDET_Pavan_Kumar;

public class StringMethods {

    public static void main(String[] args) {

        int length = findLength();
        System.out.println("length of the given string is : " + length);

        String myFullName = concatenation();
        System.out.println("My full name is : " + myFullName);

        String trimmedName = trimming();
        System.out.println("MyName : " + trimmedName);

        char atIndex = findCharacterAtIndex(myFullName, 4);
        System.out.println("Char at given \n index is  : " + atIndex);

        boolean isTheir = isThere("Shubham", "S");
        System.out.println("Is there?...." + isTheir);

        String replacedName = replaced(myFullName, 'm', ' ');
        System.out.println(replacedName);

        System.out.println(replacedName.replace("rao", " "));
    }

    static private int findLength(){
        return "Shubham".length();
    }

    static private String trimming(){

        String name = "    shubham shankar jagtap   ";
        System.out.println(name);
        System.out.println(name.length());
        return name.trim();                 // It removes right & left spaces from a given String.
    }

    static private String concatenation(){

        return ("Shubham" + "m").concat("Shankarrao").concat("Jagtap");
    }

    static private char findCharacterAtIndex(String my, int index){

        return my.charAt(index);
    }

    static private boolean isThere(String s1, String s2){

        return s1.contains(s2);
    }

    static private String replaced(String str, char toBeReplaced, char replacedBy){

        return str.replace(toBeReplaced, replacedBy);
    }
}