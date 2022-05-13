package org.java.code_test;

import java.util.Scanner;

public class middleTest1_5 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("5¹ø");
		int a = HH.nextInt();
		int b = 0;

		if (a % 2 != 0) {
			for (int i = 0; i <= a / 2; i++) {
				b = 2 * i + 1;
				System.out.print(b+" ");
				continue;
			}
		} else {
			for (int i = 1; i <= a / 2; i++) {
				b = 2 * i - 1;
				System.out.print(b+" ");
			}

		}

	}

}
