package com.ToString;

public class Study_toString {
    int roll_no;
    String name;
    String subject;
    int marks;

    public Study_toString(int roll_no,String name,String subject,int marks){
        this.roll_no=roll_no;
        this.name=name;
        this.subject=subject;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Study_toString{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {

      String a = new Study_toString(1,"SHUBHAM","ENGLISH",81).toString();

        System.out.println(a);

    }
}
