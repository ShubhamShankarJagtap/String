package com.String;

public class Concatenation_Of_Strings {
    public static void main(String[] args) {

        // using + operator.

        String s = 50 + 30 + "SACHIN TENDULKAR" + 40 + 40 ;

        System.out.println(s);

        System.out.println("----------------------------");

        // using concat method.

        String s1 = "SACHIN";

        String s2 = "TENDULKAR";

        System.out.println(s1.concat(s2));
    }
}
