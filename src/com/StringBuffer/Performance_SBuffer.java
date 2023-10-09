package com.StringBuffer;

public class Performance_SBuffer {

    static private void concatWithString(){

        String s = "SHUBHAM";

        for (int i=0;i<=1000;i++){

            s = s.concat("JAGTAP");
        }

       // return s;
    }

    static private void concatWithStringBuffer(){

        StringBuffer stringBuffer = new StringBuffer("SHUBHAM");

        for (int i=0;i<=1000;i++){

            stringBuffer.append("JAGTAP");

        }

       // return stringBuffer.toString();
    }

    static private void concatWithStringBuilder(){

        StringBuilder stringBuilder = new StringBuilder("SHUBHAM");

        for (int i=0;i<=1000;i++){
            stringBuilder.append("JAGTAP");
        }
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by concatenating with the string: " + (System.currentTimeMillis()-startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by concatenating with the stringBuffer: " + (System.currentTimeMillis()-startTime) + "ms");


        startTime = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Time taken by concatenating with the stringBuilder: " + (System.currentTimeMillis()-startTime) + "ms");

    }
}
