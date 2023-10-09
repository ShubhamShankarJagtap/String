package com.length_trim_isEmpty;

public class Demo {
    String name,email,password;
    int length() {
        name = "shubham";
        email = "shubham@gmail.com      ";
        password = "      shubham1996";
        int i = (name.length());

        if (i== 0)
            System.out.println("name is empty");
        else
            System.out.println("name is not empty");

        System.out.println(email.length());
        System.out.println(password.length());
        return i;
    }

    boolean chechEmpty(){
        name = "shubham";

        return name.isEmpty();
    }
   String triming(){
       email = "shubham@gmail.com      ";
       password = "      shubham1996";
        return email.trim() + " " + " " + password.trim();

    }
    public static void main(String[] args) {
     int lengthOfString =  new Demo().length();
        System.out.println("length  Of String is : " + lengthOfString);

        boolean verifyEmpty = new Demo().chechEmpty();
        System.out.println("is this String empty?.." + verifyEmpty);

        String trimmedString = new Demo().triming();
        System.out.println(trimmedString );
    }

}
