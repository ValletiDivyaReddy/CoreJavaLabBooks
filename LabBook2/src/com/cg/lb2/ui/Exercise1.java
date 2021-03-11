package com.cg.lb2.ui;

public class Exercise1 {

	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 2; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String args[]) {
		int a[] = { 77,7,8,6,2,4};
		int b[] = { 98, 76, 85, 27, 21, 56, 27 };
		System.out.println("Second smallest: " + getSecondSmallest(a, 6));
		System.out.println("Second smallest: " + getSecondSmallest(b, 7));
	}
}
