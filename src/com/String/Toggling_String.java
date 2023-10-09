package com.String;

public class Toggling_String {

    static private String toggle(String str){

        String [] words = str.split(" ");

        String toggle = "";

        for (String w : words){

            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            toggle += first.toLowerCase() + afterFirst.toUpperCase() + " ";

        }

        return toggle.trim();
    }

    public static void main(String[] args) {

        System.out.println(Toggling_String.toggle("my name is shubham shankarrao jagtap"));

        System.out.println(Toggling_String.toggle("i am trying very hard to get knowledgeable"));


    }

}
