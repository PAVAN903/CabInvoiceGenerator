package com.bridgelab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CabInvoiceGenerator cabinvoice=new CabInvoiceGenerator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter distance travelled");
		double distance=sc.nextDouble();
		System.out.println("enter the time travelled");
		double timeInminute=sc.nextDouble();
		double totalfare=cabinvoice.calculateFare(distance, timeInminute);
		System.out.println("Total fare is : "+totalfare);
	}

}
