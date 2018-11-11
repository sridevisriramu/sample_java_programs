package com.philips.rs.performancebridge.test.stepdefs;

public class test3_polindrum {

	public static void main(String[] args) {	
		
		int num = 14941, rem, rev=0;
		int intialnumber = num;
		
		while(num!=0)
		{
		
			rem= num%10;			
			rev=rev*10+rem;
			num=num/10;
		}
		

		System.out.println("reverse number = " + rev);
		
		if(intialnumber!=rev)
		{

			System.out.println("number is not  a polindrum= " + rev);
		}
		else
		{
			System.out.println("number is polindrum= " + rev);
		}
	}
	
	
	

}
