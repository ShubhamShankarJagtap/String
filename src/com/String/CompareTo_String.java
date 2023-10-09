package com.String;

public class CompareTo_String {
    int comparison;
    {
        System.out.println(comparison);
    }
    CompareTo_String(String s,String s1){
        comparison = s.compareTo(s1);
        System.out.printf("The unicode difference between these two strings is " + comparison);
    }
    public static void main(String[] args) {
        String s = "sHUBHAM";
        String s1 = "jAGTAP";
        new CompareTo_String(s,s1);


    }
}
