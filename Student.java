package com.oops.inheritance;
import java.util.*;
 class Student {

      int sid;
     String name;
     String address;
     float fee;

     void accept()
     {
         Scanner scn = new Scanner(System.in);
         System.out.print("enter sid");
         sid = scn.nextInt();
         System.out.print("enter name");
         name = scn.next();
         System.out.print("enter address");
         address = scn.next();
         System.out.print("enter fee");
         fee = scn.nextFloat();
     }

     void display() {
         System.out.println(sid + "/t" + name + "/t" + address + "/t" + fee);
     }
 }

     class Student2 extends Student {
         int mobileNo;
         String mailId;

         @Override
         void accept() {

             Scanner scn = new Scanner(System.in);
             System.out.print("enter sid");
             sid = scn.nextInt();
             System.out.print("enter name");
             name = scn.next();
             System.out.print("enter fee");
             fee = scn.nextFloat();
             System.out.print("enter mobileNO");
             mobileNo = scn.nextInt();
             System.out.print("enter mailId");
             mailId = scn.next();
         }

         @Override
         void display() {
             System.out.println(sid + "/t" + name + "/t" + fee + "/t" + mobileNo + "/t" + mailId);
         }
     }


     class StudentCall {

         public static void main(String[] args) {


             Student s = new Student();
             s.accept();
             s.display();

             Student2 s2 = new Student2();
             s2.accept();
             s2.display();
         }
     }
















