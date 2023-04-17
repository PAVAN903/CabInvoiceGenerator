package com.bridgelab;

import java.util.Scanner;

public class Main {
	 static double totalfare;
	 static String result;

	public static void main(String[] args) {
		CabInvoiceGenerator cabinvoice=new CabInvoiceGenerator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rides");
		int rides=sc.nextInt();
		for(int i=0;i<rides;i++) {
		System.out.println("enter distance travelled");
		double distance=sc.nextDouble();
		System.out.println("enter the time travelled");
		double timeInminute=sc.nextDouble();
		result=cabinvoice.calculateFare(distance, timeInminute, rides);
		} 
		System.out.println(result);
	}

}
