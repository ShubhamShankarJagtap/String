package com.String;

public class Reverse_Toggle {

    static private String reverseToggle() {

        String[] toggle = "my name is shubham jagtap.".split(" ");

        StringBuilder reverseToggle = new StringBuilder();

        for (String words : toggle) {

            StringBuilder stringBuilder = new StringBuilder(words);

            stringBuilder.reverse();

            String first = stringBuilder.substring(0, 1);

            String afterFirst = stringBuilder.substring(1);

            reverseToggle.append(first.toLowerCase()).append(afterFirst.toUpperCase()).append(" ");

        }

        return reverseToggle.toString().trim();

    }

    public static void main(String[] args) {

        System.out.println(reverseToggle());
    }

}