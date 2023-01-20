package com.day1;

public class Assignment7 {

	public static void main(String[] args) {
		boolean bool1= true;
		boolean bool2= true;
		boolean bool3= true;
		
		if(bool1 && (bool1 && (bool2!=false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("failure");
		}
		System.out.println("bool2 value: " + bool2);
		
		System.out.println("press any key to continue...");

	}

}
