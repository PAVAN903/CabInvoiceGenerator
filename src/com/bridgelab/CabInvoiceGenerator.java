package com.bridgelab;

public class CabInvoiceGenerator {
	double fareperKm=10.0;
	double minFare=5.0;
	public double calculateFare(double distance, double timeInminute) {
		double totalfare=(distance*fareperKm)+(timeInminute)+ minFare;
		return totalfare;
	}

}
