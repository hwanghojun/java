package org.java_code.baekjoon;

import java.util.Scanner;

public class b2577 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int A = HH.nextInt();
		int B = HH.nextInt();
		int C = HH.nextInt();
		String number = String.valueOf(A * B * C);
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < number.length(); j++) {
				if (String.valueOf(i).equals(String.valueOf(number.charAt(j)))) {
					count += 1;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
