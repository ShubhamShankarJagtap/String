package com.String;

public class    GetChars_String {
    public static void main(String[] args) {

        String s = "HOW ARE YOU SHUBHAM";
        char [] ch = new char[17];

        try {
            s.getChars(12, 19, ch, 10);
            System.out.println(ch);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
