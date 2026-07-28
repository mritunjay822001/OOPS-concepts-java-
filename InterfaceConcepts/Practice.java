package com.abstraction.concepts;
/*
  class Practice {

}
 interface X extends Practice{ 
	 
 }
 error because class can't be inherited in interface
 */
  
interface Practice{
	
}
 class X implements Practice{
	 //// A class can implement an interface using the implements keyword.
 }
  interface Show{
	  
  }
   interface Concept extends Show{//valid interface can be inherited in
	   // another interface by extends keyword
	   
   }