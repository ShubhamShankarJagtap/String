package com.Interview;

import java.util.*;

public class ReverseOnlyVowels {

    static private List<Character> reverseOnlyVowel(String original) {

        List<Character> vowel = new ArrayList<>();

        if (original.length() > 1) {
            for (int i = 0; i < original.length(); i++) {

                switch (original.charAt(i)) {
                    case 'a': {
                        vowel.add('a');
                        break;
                    }
                    case 'e': {
                        vowel.add('e');
                        break;
                    }
                    case 'i': {
                        vowel.add('i');
                        break;
                    }
                    case 'o': {
                        vowel.add('o');
                        break;
                    }
                    case 'u': {
                        vowel.add('u');
                        break;
                    }
                }
            }
        }
        return vowel;
    }
    public static void main(String[] args) {

        String original = "Shubham Shankarrao Jagtap.";

        List<Character> chars = reverseOnlyVowel(original);
        System.out.println("are there any vowels presents?... " + chars.isEmpty());
        System.out.println("number of vowels present are : " + chars.size());
        ListIterator<Character> iterator = chars.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
