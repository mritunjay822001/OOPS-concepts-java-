package com.oops.Polymorphism;
import java.util.Scanner;

 class  Practice {
     int sid;
     float fee;
     String course;
     void accept() {
         Scanner scn = new Scanner(System.in);
         System.out.print("enter sid");
         sid = scn.nextInt();
         System.out.print("Enter fee");
         fee = scn.nextFloat();
         System.out.print("enter course");
         course = scn.next();
     }
      void display()
      {
        System.out.println(sid+"/t"+fee+"/t"+course);

     }

}
  class Record extends Practice
  {
      String address;
      long mobileNo;
      @Override
      void accept()
      {
       Scanner scn=new Scanner(System.in);
       System.out.print("enter sid");
       sid=scn.nextInt();
       System.out.print("enter fee");
       fee=scn.nextFloat();
       System.out.print("enter Address");
       address=scn.next();
       System.out.print("enter mobileNo");
       mobileNo=scn.nextInt();
      }
       @Override
      void display()
       {
           System.out.println(sid+"/t"+fee+"/t"+address+"/t"+mobileNo);
       }


  }
   class MainCall {
       public static void main(String[] args){

           Practice p = new Practice();
           p.accept();
           p.display();
           Record r=new Record();
           r.accept();
           r.display();
       }
   }
