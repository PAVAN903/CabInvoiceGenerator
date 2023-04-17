package com.bridgelab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {
	String actual="";
	
	
	CabInvoiceGenerator cabinvoice=new CabInvoiceGenerator();
	@Test
	void CalculateFaretest() {
	    double distance[]= {10,15};
	    double timeInminute[]= {20,30};
	    int rides=1;
	    for(int i=0;i<rides;i++) {
		String actual=cabinvoice.calculateFare(distance[i], timeInminute[i], rides);
	    }
	     String expected = "Total number of rides: 2 Total fare: 310.0 Average Fare Per Ride: 155.0";
	    Assertions.assertEquals(actual, expected);
		
		 
	}

}
