package com.bridgelab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabinvoice=new CabInvoiceGenerator();
	@Test
	void CalculateFaretest() {
		double distance=30;
		double time=15;
		double actual=cabinvoice.calculateFare(distance, time);
		Assertions.assertEquals(320, actual);
		//(30*10)+15+5=320
		 
	}

}
