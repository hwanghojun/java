package org.java_code.baekjoon;

import java.util.Scanner;

public class b9226 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		while (true) {
			String A = HH.next();
			int a = 0;
			for (int i = 0; i < A.length(); i++) {
				if (A.charAt(i) == 'a' | A.charAt(i) == 'e' | A.charAt(i) == 'i' | A.charAt(i) == 'o'
						| A.charAt(i) == 'u') {
					a = i;
					break;
				}
			}
			if (A.charAt(0) == '#')
				break;
			System.out.println(A.substring(a) + A.substring(0, a) + "ay");
		}
	}
}
