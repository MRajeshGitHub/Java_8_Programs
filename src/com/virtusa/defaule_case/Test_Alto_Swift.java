package com.virtusa.defaule_case;

public class Test_Alto_Swift {

	public static void main(String[] args) {
		
		System.out.println("AT ALTO CAR");
		Vehicle v= new Alto();
		String airBags = v.airBags();
		System.out.println(airBags);
		String alarmOn = v.alarmOn();
		System.out.println(alarmOn);
		
		System.out.println("-------------");
		System.out.println("AT swift CAR");
		Vehicle v1=new Swift();
		String airBags2 = v1.airBags();
		System.out.println(airBags2);
		String alarmOn2 = v1.alarmOn();
		System.out.println(alarmOn2);
	}
}
