package com.cts.test;

import com.cts.model.AB;
import com.cts.model.Interface1;

public class InterfaceDemoTest {

	public static void main(String[] args) {
		AB object = new AB();
		System.out.println(object.add(12, 20));
		System.out.println(object.substraction(12, 10));
		object.show();
		
		
		System.out.println(Interface1.multiply(12, 10));
	}

}
