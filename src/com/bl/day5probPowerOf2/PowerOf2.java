package com.bl.day5probPowerOf2;

public class PowerOf2 {
	public static void main(String[] args) {

		int n = 0;
		int i = 0;
		int powerOfTwo = 1;
		while (i <= n && n < 31) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;
			n++;
		}

	}

}
