package com.StringBuffer;

public class HashCode_values {

    public static void main(String[] args) {

        String s = "SHUBHAM";

        System.out.println("HashCode test for String.");

        System.out.println(s.hashCode());

        s = s.concat("JAGTAP");

        System.out.println(s.hashCode());

        System.out.println("------------------------------");

        System.out.println("HashCode test for StringBuffer.");

        StringBuilder stringBuffer = new StringBuilder("SHUBHAM");

        System.out.println(stringBuffer.hashCode());

        stringBuffer.append("JAGTAP");

        System.out.println(stringBuffer.hashCode());
    }
}
