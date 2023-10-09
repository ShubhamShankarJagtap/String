package com.String;

public class String_Comparison {
    public static void main(String[] args) {

        String s1 = "HELLO";

        String s2 = "HELLO";

        String s3 = new String("HELLO");

        String s4 = "WELCOME";

        // Authentication by comparing the string using equals method.

        System.out.println(s1.equals(s2));  // true

        System.out.println(s1.equals(s3));  // true

        System.out.println(s1.equals(s4));  // false

        System.out.println("------------------------------------------");

        // comparing two strings by using == operator which compares reference matching.

        System.out.println(s1==s2);  // true

        System.out.println(s1==s3);  // false

        System.out.println("--------------------");

        // comparing string lexographically using compareTo()

        System.out.println(s1.compareTo(s2));  // 0 because strings are equal.

        System.out.println(s1.compareTo(s3));   // 0 because strings are equal.

        System.out.println(s1.compareTo(s4));  // -15 because H(79)-W(94) = -15.

        System.out.println(s4.compareTo(s1));  // 15  because W(94)-H(79).
    }
}
