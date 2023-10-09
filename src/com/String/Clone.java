package com.String;


import static java.lang.System.*;
public final class Clone {

    public Clone(){
        out.println("IN A ZERO ARGS CONSTRUCTOR.");
        out.println("Learn, Organize and fight to win.");
    }
    public static void main(String[] args) {
        String s = "SHUBHAM";
        out.println(s.hashCode());
             new Clone();
    }


}

