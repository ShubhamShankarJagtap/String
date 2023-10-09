package com.String;

import java.util.Arrays;

import static java.lang.System.out;

public class Delimiter {

    public static void main(String[] args) {

        String s = "Cyber,Success,Private,Limited,Deccan,Pune";

        out.println(s);

        String [] v = s.split(",");

        Arrays.stream(v).forEach(out::println);

        out.println(s.substring(2));

        out.println(Arrays.toString(v.clone()));

    }
}
