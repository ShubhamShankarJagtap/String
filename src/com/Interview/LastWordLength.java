package com.Interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Problem Statement: - Given a String consisting of words and spaces, return the length of the last word in a String.
                                     A word is a maximal substring consisting of non-space characters only.
 */
public class LastWordLength {

    static Pattern pattern;
    static Matcher matcher;
    static private int lastWord(String input){

        pattern = Pattern.compile("\\w+");
        matcher = pattern.matcher(input);
        String lastword=null;
        while (matcher.find()){
            lastword= matcher.group();
        }

        int length=0;
        if (lastword!=null){
            length=lastword.length();
        }
        return length;
    }

    public static void main(String[] args) {

        String inputString = "    fly  me to the  moon by using parachute  ";
        int length = lastWord(inputString);
        System.out.println("The length of last word is : " + length);
    }
}
