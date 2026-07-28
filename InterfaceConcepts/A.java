package com.Interfaces.practice;

  interface A {
	  int x=15;//public static final int x=10;
	  void accept() ;
	   void display();//public abstract void display();
  }
   class B implements A{
	   
	  @Override
	 public void accept() {
		  System.out.println("accept() method");
	  }
	   @Override
	   public void display() {
		   System.out.println("display() method");
	   }
	    void print() {
	    	System.out.println("print() method");
	    }
	     int y=50;
   }
    class C{
    	public static void main(String[] args) {
    	  // B b=new A();// B b = new A();   //  Interface cannot be instantiated
    		B b= new B();
    		 System.out.println(b.x);
    		 b.accept();
    		 b.display();
    		 System.out.println(b.y);
    		 
    		 A a=new B();// upcasting
    		 a.accept();
    		 a.display();
    		 System.out.println(a.x);
    		// System.out.println(a.y);// can't accessed by A class ref
    		// a.print(); can't accessed by A class reference
    		
    	}
    	//A a = new B();      // Upcasting

        //B b = (B) a;        // Downcasting 
    }
    
		  
		  
	  
   
	  


