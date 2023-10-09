package com.String;

public class Split_String {
    public static void main(String[] args) {

        String s = "JAVA IS AWESOME";

        String [] arr = s.split(" ");

        for (String n : arr){

            System.out.println(n);
        }
    }
}
