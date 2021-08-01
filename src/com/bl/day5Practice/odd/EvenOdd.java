package com.bl.day5Practice.odd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("enter num1");
		num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
	}
		sc.close();
}
}
