package com.String;

public class GetBytes_String {


    public static void main(String[] args) {

        String s = "SHUBHAM";

        byte[] br = s.getBytes();

        byte evenIndex=0;
        byte[] evenArray = new byte[evenIndex];
        for (byte b : br){

            if(b%2==0) {
                evenIndex++;
                evenArray[0]=b;
            }
        }
        System.out.println(evenIndex);



    }
}
