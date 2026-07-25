package com.oops.Polymorphism;

public class Demo{
    int max(int a,int b)
    {
        if(a>b)
            return a;
        else return b;
    }
     int max(int a,int b,int c) {
         if (a > b && a > c)
             return a;
         else if(b >c)
         return b;
         else
         return c;

     }
      public static void main(String[] args)
      {
          Demo d =new Demo();
          int x=d.max(55,77);
          System.out.println(x);
          int y=d.max(77,66,99);
          System.out.println(y);



      }



     }




