package com.cg.lb1.ui;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int i = 2, n = s.nextInt(), flag;
		while (i <= n) {
			flag = 0;
			for (int j = 2; j < i - 1; ++j) {
				if (i % j == 0) {
					flag = 1;
				}
			}
			if (flag == 0)
				System.out.println(i);
			++i;
		}
		s.close();
	}
}
