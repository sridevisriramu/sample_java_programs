package com.philips.rs.performancebridge.test.stepdefs;

public class test4_leapYear {

//leap year
	public static void main(String[] args) {	
		
		int num=2016;
		
		if((num%400 == 0) || (num%4 == 0 && num%100 != 0))
		{
			System.out.println("num is  leap year");
		}
		else
		{
			System.out.println("num is not leap year");
		}
		
		
	
	
	}
	

}



