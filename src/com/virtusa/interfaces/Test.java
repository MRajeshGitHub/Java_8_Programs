package com.virtusa.interfaces;

public interface Test {

	void m1();//no body in abstract method under the interface
	
	
}

class Demo implements Test{
	public void m1() {
		System.out.println("this is m1 inteface method implementation...");
	}
}

