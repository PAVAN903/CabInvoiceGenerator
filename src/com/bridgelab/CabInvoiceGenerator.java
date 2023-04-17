package com.bridgelab;

public class CabInvoiceGenerator {
	double fareperKm = 10.0;
	double minFare = 5.0;
	double totalfare = 0;
	double avgfare = 0;

	String calculateFare(double distance, double timeInminute, int rides) {
		totalfare = totalfare + (distance * fareperKm) + (timeInminute) + minFare;
		avgfare = totalfare / rides;
		return "Total number of rides: " + rides + " Total fare: " + totalfare + " Average Fare Per Ride: " + avgfare;
	}
}
