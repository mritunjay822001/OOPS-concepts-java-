package com.abstraction.concepts;



abstract class Electronics {
	 abstract void powerOn();
	 abstract void powerOff();
	 abstract void makeCall();
	 abstract void sendMessage();
	 abstract void showDisplaySize();
	 abstract void showOperatingSystem();
	 abstract void showRam();
	 static void chargingRule(){
		 System.out.println("Don't Charge above 90%");
	 }
	 static void batteryHealthTips() {
		 System.out.println("!<20%");
		  System.out.println("!>90%");
	 }
	  static void additionalInfo() {
		  System.out.println("Use Original Adapter only");
	  }
}
  abstract class Mobile extends Electronics
  {
	   abstract void unlockPhone();
	   abstract void openCamera();
	   abstract void enableWifi();
	   abstract void disableHotspot();
	   abstract void takeScreenShot();
	   abstract void openGallery();
  } 
    class Apple extends Mobile{
   	 @Override
   	 void powerOn()
   	 {
   		 System.out.println("Press & hold Button for 5 seconds");
   	 }
   	 @Override
   	  void  powerOff() {
   		 System.out.println("Press & hold button for 5 sec");
   		  
   	  }
   	  @Override
   	   void makeCall() {
   		  System.out.println("Open Phone application to call");
   	  }
   	  @Override
   	  void sendMessage() {
   		  System.out.println("Open Message Application to send message");
   	  }
   	   @Override
   	   void showDisplaySize() {
   		   System.out.println("Open settings/General/->>properties");
   	   }
   	    @Override
   	    void showOperatingSystem() {
   	    	System.out.println("Open setting->>properties");
   	    }
   	    @Override
   	    void showRam() {
   	    	System.out.println("Open setting-> show Ram Info");
   	    }
   	     @Override
   	     void unlockPhone() {
   	    	 System.out.println("Enter password/Pin/Faceid");
   	     }
   	     @Override
   	     void openCamera() {
   	    	 System.out.println("Click on Camera Icon");
   	     }
   	     @Override
   	     void enableWifi() {
   	    	 System.out.println("Open setting->wifi->connect");
   	     }
   	      @Override
   	      void disableHotspot() {
   	    	  System.out.println("Open Setting->Hotspot->Off");
   	      }
   	       @Override
   	       void takeScreenShot() {
  	              System.out.println("Slide screen with 3 fingers/press Power Button and Volume Up button Together");
   	       }
   	        @Override
   	        void openGallery() {
   	        	System.out.println("Click on Photos App Icon");
   	        }
   	         static void brandName() {
   	        	 System.out.println("Apple");
   	         }
   	          static void modelName() {
   	        	  System.out.println("Iphone 17 Pro Max");
   	          }
   	          static void countryOrigin() {
   	        	  System.out.println("USA");
   	          }
   	          static void osType() {
   	        	  System.out.println("IOS");
   	          }
   	          static void price() {
   	        	  System.out.println("1 lakh 49 thousands");
   	          }
   	           static void launchDate() {
   	        	   System.out.println("6 Sep 2025");
   	           }
    }
   	         class Samsung extends Mobile{
   	        	 @Override
   	        	  void powerOn() {
   	        		 System.out.println("Press Power/side Button for 3 Seconds");
   	        	 }
   	        	  @Override
   	        	   void powerOff() {
   	        		  System.out.println("Press Power->>side Button for 3 seconds");
   	        	  }
   	        	   @Override
   	        	   void makeCall() {
   	        		   System.out.println("Open Dilaler App/phone app");
   	        	   }
   	        	    @Override
   	        	    void sendMessage() {
   	        	    	System.out.println("Open Message App");
   	        	    }
   	        	     @Override
   	        	     void showDisplaySize() {
   	        	    	 System.out.println("Open Setting->> Display-> properties");
   	        	     }
   	        	      @Override
   	        	      void showOperatingSystem() {
   	        	    	  System.out.println("open Setting->General->About");
   	        	      }
   	        	       @Override
   	        	       void showRam() {
   	        	    	   System.out.println("Open Setting->About->RamInfo");
   	        	       }
   	        	       @Override
   	        	       void unlockPhone() {
   	        	    	   System.out.println("Enter Pin/Pattern/FaceId");
   	        	       }
   	        	       @Override 
   	        	        void openCamera() {
   	        	    	   System.out.println("Tap on Camera Icon");
   	        	       }
   	        	        @Override
   	        	        void enableWifi() {
   	        	        	System.out.println("Open Setting->networks->Wifi");
   	        	        }
   	        	        @Override
   	        	        void disableHotspot() {
   	        	        	System.out.println("Open Setting->network->Hotspot");
   	        	        }
   	        	        @Override
   	        	        void takeScreenShot() {
   	        	        	System.out.println("Slide Down with 3 fingers On screen");
   	        	        }
   	        	        @Override
   	        	        void openGallery() {
   	        	        	System.out.println("Click on Galleery/photo Icon");
   	        	        }
   	        	        static void brandName() {
   	        	        	System.out.println("Samsung");
   	        	        }
   	        	        static void modelName() {
   	        	        	System.out.println("Samsung S26 Ultra");
   	        	        }
   	        	        static void countryOrigin() {
   	        	        	System.out.println("South Korea");
   	        	        }
   	        	         static void osType() {
   	        	        	 System.out.println("Andriod");
   	        	         }
   	        	         static void price() {
   	        	        	 System.out.println("1 lakh 30 thousands");
   	        	         }
   	        	         static void launchDate() {
   	        	        	 System.out.println("10 Aug 2025");
   	        	         }
   	         }
   	             // MAIN METHOD FOR EXECUTION
   	                      class Demo{
   	                    	  public static void main(String[] args) {
   	                    		  Mobile m=new Apple();
   	                    		  //Apple class Object
   	                    		  m.powerOn();
   	                    		  m.powerOff();
   	                    		  m.makeCall();
   	                    		  m.sendMessage();
   	                    		  m.showDisplaySize();
   	                    		  m.showOperatingSystem();
   	                    		  m.showRam();
   	                    		  m.unlockPhone();
   	                    		  m.openCamera();
   	                    		  m.enableWifi();
   	                    		  m.disableHotspot();
   	                    		  m.takeScreenShot();
   	                    		  m.openGallery();
   	                    		  // Samsung Class Object 
   	                    		  Mobile m1=new Samsung();
   	                    		  m.powerOn();
   	                    		  m.powerOff();
   	                    		  m.makeCall();
   	                    		  m.sendMessage();
   	                    		  m.showDisplaySize();
   	                    		  m.showOperatingSystem();
   	                    		  m.showRam();
   	                    		  m.unlockPhone();
   	                    		  m.openCamera();
   	                    		  m.enableWifi();
   	                    		  m.disableHotspot();
   	                    		  m.takeScreenShot();
   	                    		  m.openGallery();
   	                    		  //calling Static methods Of Electronics Class
   	                    		  Electronics.chargingRule();
   	                    		  Electronics.batteryHealthTips();
   	                    		  Electronics.additionalInfo();
   	                    		   // calling Static methods of Apple class
   	                    		   Apple.brandName();
   	                    		   Apple.modelName();
   	                    		   Apple.countryOrigin();
   	                    		   Apple.osType();
   	                    		   Apple.price();
   	                    		   Apple.launchDate();
   	                    		    //Calling Static methods of Samsung Class
   	                    		   Samsung.brandName();
   	                    		   Samsung.modelName();
   	                    		   Samsung.countryOrigin();
   	                    		   Samsung.osType();
   	                    		   Samsung.price();
   	                    		   Samsung.launchDate();
   	                    		   
   	                    		  
   	                    		  
   	                    		  
   	              
   	                    		  
   	                    	  }
   	        	   
   	        	  
   	          }
   	                      
   	 
   	        	    	   
   	        	    	   
   	        
   	        	    
   	         	         
    