package com.philips.rs.performancebridge.test.stepdefs;

import java.util.Arrays;

public class Unique_using_Distinct {

	public static void main(String[] args) {	
		
		int [] arr = {3, 3, 8, 3,  2, 23, 5, 2,3, 9};
		
		int jj [] = Arrays.stream(arr).distinct().toArray(); 
		
		
		    
	for(int i =0; i< arr.length-1; i++)
	{
	System.out.println("unique list = " + jj[i]);
	}

	}
	
	
	

}
