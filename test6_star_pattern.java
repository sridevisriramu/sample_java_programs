package com.philips.rs.performancebridge.test.stepdefs;



public class test6_star_pattern {

//print star pattern
	public static void main(String[] args) {	
		
	
		int rowCount=10;
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=i; j<=rowCount; j++)
			
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
			
	
	}
	

}



