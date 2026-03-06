package com.java;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=20;
		long Factorial = 1;
		for(int i=1;i<=num;i++)
		{
			Factorial = Factorial * i;
			
		}
		System.out.println(Factorial);

	}

}
