package Run3;

import org.testng.annotations.Test;



import Com.pages3.Home_page3;
import Com.pages3.Passenger_information;
import Com.pages3.Result_page3;
import Com.pages3.continue3;
import Common3.browsers3;



public class Book_flight extends browsers3 {
	 
	  @Test
	  public void f() throws InterruptedException {
		
		Home_page3 h= new Home_page3(driver);
		Thread.sleep(3000);
			h.fligt();
			h.rndtrip();
			Thread.sleep(4000);
			h.fromcity("Washington");
			h.destcity("Newyork");
		    h.deptim();
		    
		    h.depdat();
		    Thread.sleep(2000);
	        h.rettim();
	        
	        h.retdat();
	        Thread.sleep(3000);
	        h.serch();
		Thread.sleep(5000);
			
	
		Result_page3 j= new Result_page3(driver);
		Thread.sleep(5000);
			  j.s1();
			  Thread.sleep(4000);
			  j.s2();
			  Thread.sleep(4000);
			  j.s3();
			  Thread.sleep(4000);
			  j.s4();
			  Thread.sleep(4000);
			  j.notanks();
			  
			  
			  continue3 C= new continue3(driver);
			  Thread.sleep(5000);
				C.con3();
				Thread.sleep(5000);
				
				Passenger_information y=new Passenger_information(driver);
				Thread.sleep(5000);
				
			  y.fistnam("Koorosh");
				y.lastnam("Kheirabadi");
				Thread.sleep(2000);
				
				y.phon("7032345677");
			    y.gndr();
			    y.dat();
			    Thread.sleep(3000);
			    
		  }
			  
			  }
		  


