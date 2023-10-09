package com.String;

public class Replace {

    String s = "this is demo.";
    void replaceLearn(){
        System.out.println(s.replace("is","was"));
        System.out.println(s.replace('i','w'));
        System.out.println(s.replaceFirst("is","was"));
        System.out.println(s.replaceAll("is(.)","was"));
        System.out.println(s.replaceAll("is(.*)","was"));
    }

    {
        System.out.println("this is instance block.");
    }
    public static void main(String[] args) {
        new Replace().replaceLearn();
        new Replace();
    }
}
