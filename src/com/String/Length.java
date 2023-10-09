package com.String;

public class Length {
    String name="shubham";
    String email = "shubh  123@gmail com";
    String password="abdc";
    void checkLength(){
        int k = name.length();
       if (0==k){
            System.out.println(name + "is empty:");
        }
        else {
            System.out.println(name.length());
        }
        int j=email.length();
        if(0==j){
            System.out.println(email + "is empty:");
        }
        else{
            System.out.println(email.length());
        }
       int l=password.length();
        if(0==l){
            System.out.println(password + "is empty:");
        }
        else {
            System.out.println(password.length());
        }
        System.out.println(email.replaceAll(" (.)",""));
    }
    public static void main(String[] args) {
            new Length().checkLength();
    }
}
