package com.bl.day5probHarmonic;

public class HarmonicNumber {
	public static void main(String[] args) {

		float result = 1;
		float N = 8;
		for (int i = 1; i < N; i++) {

			result = result + (float) 1 / N;
			System.out.println("Harmonic  " + result);
			N--;
		}

	}
}
