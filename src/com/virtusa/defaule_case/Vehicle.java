package com.virtusa.defaule_case;

public interface Vehicle {

	default String airBags() {
		return "Two sirbags";
	}
	default String alarmOn() {
		return "at speed of 100";
	}
	
	int maxSpeed();//abstract method without body
}

