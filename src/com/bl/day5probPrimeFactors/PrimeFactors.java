package com.bl.day5probPrimeFactors;

public class PrimeFactors {
	public static void main(String[] args) {
		int i = 1,count = 0, N = 30;
		while (N % i == 0) {

			System.out.println("Factors " + i);
			i++;
			count++;
			System.out.println("Number of factors :"+count);
		}
	}

	

}
