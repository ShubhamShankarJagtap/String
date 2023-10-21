package com.String;

public class Split_String {

 static    private void learnSplit(){

     String[] forSplit = "Name=Shubham,Designation=QA,Age=27".split(",");

     for (String d: forSplit){

         System.out.println(d);
     }
    }
    public static void main(String[] args) {

        String s = "JAVA IS AWESOME";

        String [] arr = s.split(" ");

        for (String n : arr){

            System.out.println(n);
        }

        learnSplit();
    }
}
