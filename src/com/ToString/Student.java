package com.ToString;
import static java.lang.System.*;
public class Student {
    int roll_No;
    String name;
    String city;

    Student(int roll_No,String name,String city){

        this.roll_No = roll_No;

        this.name = name;

        this.city = city;
    }

    public String toString(){

        return roll_No + " " + name + " " + city;
    }

    public static void main(String[] args) {

        Student s1 = new Student(1,"SHUBHAM JAGTAP","KHANDALA.");

        Student s2 = new Student(2,"SATYAM DUBE","PUNE.");

        out.println(s1);

        out.println(s2);

        /*

        S1 & S2 will print the hashcode values of an object.

        If we want to print those object's string representation, then we will have to override toString() of object class.

        */

    }
}
