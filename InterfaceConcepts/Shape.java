package com.Interfaces.practice;

 interface Shape {
	 void draw();
	 double area();
	 double perimeter();
	 void display();
 }
  class Circle implements Shape{
	   int r=5;
	   @Override
	   public void draw() {
		   System.out.println("Circle is Drawing");
	   }
	    @Override
	     public double area() {
	    	return 3.14*r*r;//(area=πr2
	    }
	    @Override
	    public double perimeter() {
	    	return 2*3.14*r;
	 
	    }
	     @Override
	     public void display() {
	    	 System.out.println("circle Information");
	    	 
	     }
  }
   class Rectangle implements  Shape {
	   int length=10;
	   int width=5;
	   @Override
	   public void draw() {
		   System.out.println("Rectangle  Drawn");
	   }
	   @Override
	   public double area() {
		   return length*width;
	   }
	     @Override
	     public double perimeter() {
	    	 return 2*(length+width);
	     }
	      @Override
	      public void display() {
	    	  System.out.println("Rectangle Information");
	      }
   } 
  
  class Result{
	  public static void main(String[] args) {
		  Circle c=new Circle();
		   double d=c.area();
		   System.out.println("Area =" + d);
		   double d1=c.perimeter();
		   System.out.println( "perimeter=" + d1);
		   c.display();
		   c.draw();
		   
		    Rectangle r=new Rectangle();
		    double d3=r.area();
		    System.out.println("Area="+ d3);
		    double d4=r.perimeter();
		    System.out.println("Perimeter=" + d4);
		    r.display();
		    r.draw();
		     Shape s1=new Circle();
		     s1.draw();
		     s1.display();
		     System.out.println(s1.area());
		     System.out.println(s1.perimeter());
		     Shape s2= new Rectangle();
		     s2.draw();
		     s2.display();
		     System.out.println(s2.area());
		     System.out.println(s2.perimeter());
		   //  s1.r(); error not defined in shape interface
		    // s1.length(); error not defined in shape interface
	  }
  }
