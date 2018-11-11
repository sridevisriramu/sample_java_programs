package com.philips.rs.performancebridge.test.stepdefs;

public class test5_Fibonaci {

	static int a = 0, b = 1, c;

	public static void main(String[] args) {

		// fibonacci series

		test5_Fibonaci obj = new test5_Fibonaci();
		obj.printFib(10);

	}

	void printFib(int i) {
		if (i > 1) {
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;

			printFib(i - 1);
		}

	}

}
