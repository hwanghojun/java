package org.java_code.baekjoon;

import java.util.Scanner;

public class b2495 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String A = HH.next();
			int count1 = 1,count2 = 1;
			for (int j = 0; j < A.length() - 1; j++) {
				if (A.charAt(j) == A.charAt(j + 1)) {
					count1++;
					if (count1 > count2) {
						count2 = count1;
					}
				} else {
					count1 = 1;
				}
			}
			System.out.println(count2);
		}
	}
}
