package com.virtusa.static_default;

public class CreditCard_Test implements CreditCard {

	public static void main(String[] args) {
		
	 
		System.out.println("Card type : "+cardType);
		CreditCard.benifits();//static method call using inteface name
	}
}
