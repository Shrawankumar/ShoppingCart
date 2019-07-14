package com.shopping;

public class MainTest {

	
	public static void main(String[] arg){
		
		
		Premium premium = new Premium();
		Customer premiumCustomer = new Customer("Shrawan", premium);
		
		int totalBill1 = premiumCustomer.getBill(4000);
		System.out.println(totalBill1);
		
		int totalBill2 = premiumCustomer.getBill(8000);
		System.out.println(totalBill2);
		int totalBill3 = premiumCustomer.getBill(12000);
		System.out.println(totalBill3);
		int totalBill4 = premiumCustomer.getBill(20000);
		System.out.println(totalBill4);
		
		
		Regular regular = new Regular();
		Customer regularCustomer = new Customer("Kumar", regular);
		
		int regularCustomer1 = regularCustomer.getBill(5000);
		System.out.println(regularCustomer1);
		
		int regularCustomer2 = regularCustomer.getBill(10000);
		System.out.println(regularCustomer2);
		int regularCustomer3 = regularCustomer.getBill(15000);
		System.out.println(regularCustomer3);
		
	}
}
