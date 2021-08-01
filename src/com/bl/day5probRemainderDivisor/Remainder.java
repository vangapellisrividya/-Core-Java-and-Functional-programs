package com.bl.day5probRemainderDivisor;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int remainder;
		System.out.println("enter divider");

	int divider= sc.nextInt();
	System.out.println("enter divisior");
int divisior= sc.nextInt();
	
	
		float quotient;
		remainder=divider%divisior;
		quotient = divider/divisior;
		System.out.println("remainder is :"+remainder);
		System.out.println("quotient is :"+quotient);
		sc.close();

		
	}

}
