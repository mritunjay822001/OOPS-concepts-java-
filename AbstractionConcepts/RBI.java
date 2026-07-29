package com.abstraction.concepts;

 abstract class RBI {
	  float balance;
	   RBI(float balance){
		   this.balance=balance;
	   }
	    abstract void withdraw(float amount);
	      void deposit(float amount) {
	    	  balance=balance+amount;
	      }
	       float getBalance() {
	    	   return balance;
	       }

}
   class ICICIBank extends RBI{
	   ICICIBank(float balance){
		   super(balance);
	   }
	    @Override
	    
	    void withdraw(float amount) {
	    	if (balance<amount) {
	    		System.out.println("Insufficient fund");
	    	}
	    	else
	    	{
	    		if(amount>50000.00f)
	    		{
	    			System.out.println("MAX withdrawal amount limit in ICICI is 50k only");
	    		}
	    		else
	    		{
	    			balance=balance-amount;
	    		}
	    	}
	    }
   }
    class SBI extends RBI{
    	 SBI(float  balance){
    		 super(balance);
    	 }
    	  @Override
    	  void withdraw(float amount) {
    		  if (balance<amount) {
    			  System.out.println("Insufficent funds");
    		  }
    		  else
    		  {
    			  if(amount>25000.00f) {
    				  System.out.println("MAX Withdrawal amount limit in SBI is 25k only");
    			  }
    			  else {
    				  balance=balance-amount;
    			  }
    		  }
    	  }
    }
       class Procedure{
    	   public static void main(String[] args) {
    		   
    		   //creating ICICIBank Class OBJ
    		   
    		   ICICIBank ib=new ICICIBank(80000.00f);
    		   System.out.println(ib.getBalance());
    		   ib.withdraw(90000.00f);
    		   ib.withdraw(60000.00f);
    		   ib.withdraw(40000.00f);
    		   System.out.println(ib.getBalance());
    		   
    		   //creating SBI Class OBJ
    		   
    		   SBI sb=new SBI(80000.00f);
    		   System.out.println(sb.getBalance());
    		   sb.withdraw(90000.00f);
    		   sb.withdraw(60000.00f);
    		  // sb.withdraw(40000.00f);
    		   sb.withdraw(25000.00f);
    		   System.out.println(sb.getBalance());
    		   
    		   
    	   }
    	    
       }
