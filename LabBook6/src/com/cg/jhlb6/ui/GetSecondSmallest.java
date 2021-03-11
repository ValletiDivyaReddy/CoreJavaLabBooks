package com.cg.jhlb6.ui;

import java.util.ArrayList;
import java.util.Collections;

public class GetSecondSmallest {
	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}

		Collections.sort(list);
		return list.get(1);
	}

	public static void main(String[] args) {
		int[] arr = { 2,4,6,8,9 };
		System.out.println(getSecondSmallest(arr));
	}
}