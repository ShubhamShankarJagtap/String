package com.String;

public class Intern_Strings {
    public static void main(String[] args) {

        String s = "hello".intern();

        String s1 = new String("hello");

        System.out.println(s1 == s);
    }
}
