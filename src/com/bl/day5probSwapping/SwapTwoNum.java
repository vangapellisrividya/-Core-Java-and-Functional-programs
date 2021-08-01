package com.bl.day5probSwapping;

import java.util.Scanner;

public class SwapTwoNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int num3;
		System.out.println("enter num1");
		num1 = sc.nextInt();
		System.out.println("enter num2");
		num2 = sc.nextInt();
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("enter num1  :" + num1);
		System.out.println("enter num2  :" + num2);
		sc.close();
	}
}
