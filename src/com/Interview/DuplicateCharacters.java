package com.Interview;

public class DuplicateCharacters {

    static private char[] findDuplicateCharacters(String input){
        int length=0;
        char[] duplicateLetter=new char[length];
        for (int i=0;i<input.length();i++){
            for (int j=i+i;j<input.length();j++){
                if (input.charAt(i)==input.charAt(j)){
                    length++;
                }
            }
        }
        return duplicateLetter;
    }

    public static void main(String[] args) {

        char[] duplicate = findDuplicateCharacters("ShubhamShankarJagtap");

        for (char c : duplicate){
            System.out.print(" " + c + ",");
        }
    }
}
