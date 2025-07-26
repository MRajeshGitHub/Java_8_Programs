package com.virtusa.static_default;

public interface CreditCard {

	String cardType="VISA-Platinum";
	static void benifits() {
		System.out.println("Benifits on fling,Dining and More..");
	}
}
