package com.java;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=5;
		boolean isPrime=true;
		int i;
		for(i=2; i<=num/2;i++);
		{
			if(num % i == 0)
			{
				isPrime=false;
		        
			}
		}
		if(isPrime)
		System.out.println(num + "is prime number");
		else
		System.out.println(num + "is not prime Number");
				

	}

}
