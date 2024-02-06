package com.Interview;

public class RemoveJunk {

    static private String removeJunk(String junkString) {

        String correctedString = "";
        correctedString = junkString.replaceAll("[^a-zA-Z0-9]", " ");
        return correctedString;
    }

    public static void main(String[] args) {

        String junk = "!#$%^&*  latin string 302347920";

        String correctedString = removeJunk(junk);
        System.out.println("The corrected string is : " + correctedString.stripLeading());
    }
}
