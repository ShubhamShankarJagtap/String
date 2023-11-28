package com.String;

import java.util.Scanner;

public class Empty_Sting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        byte[] array = a.getBytes();

        System.out.println(a.isEmpty()); // true

        String b = null;

        for (byte each : array) {

            System.out.println(each);
        }
        try {
            System.out.println(b.isEmpty());
            scanner.close();
        } catch (NullPointerException n) {
            System.out.println("you are getting an exception.");
            n.printStackTrace();
        }
    }
}
