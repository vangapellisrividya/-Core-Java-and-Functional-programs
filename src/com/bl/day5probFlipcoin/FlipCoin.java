package com.bl.day5probFlipcoin;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int  totalrand = 0,tail = 0, head = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			float d = (float) (Math.random() % 1);
			totalrand = totalrand+1;
			if (d < 0.5) {
				tail = tail+1;
				System.out.println("it is tail");
			}

			else {
				head = head+1;
				System.out.println("it is heads");
			}
			
		}
		System.out.println(" "+head+" "+tail+" "+totalrand);
		float tailPercent, headPercent;
		tailPercent = (tail*100)/totalrand;
		headPercent = (head*100)/totalrand;
		System.out.println(" "+headPercent+" "+tailPercent);
	}
}
