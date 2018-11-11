package com.philips.rs.performancebridge.test.stepdefs;

public class test2_sorting {

	public static void main(String[] args) {	
		
		int [] ss = {3, 8, 2, 23, 5, 3};
		
		
		
		for(int i=0; i<ss.length; i++)
		{
			for(int j=i+1; j<ss.length; j++)
			{				
				int tmp;
				
				if(ss[i]>ss[j])
				{					
					tmp =ss[i];
					ss[i]=ss[j];
					ss[j]=tmp;
				}
			}
				
					
		}
		
		for(int i=0; i<ss.length; i++)
		{
			System.out.println("sorted list = " + ss[i]);
		}		

	}
	
	
	

}
