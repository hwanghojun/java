package org.java_code.baekjoon;

import java.util.Scanner;

public class b2839 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int stop = 0;
		for (int i = 0; 3 * i <= N; i++) {
			if (stop != 0)
				break;
			for (int j = 0; 5 * j <= N; j++) {
				if (N == 3 * i + 5 * j) {
					stop = i + j;
					System.out.println(i + j);
					break;
				}
			}
		}
		if (stop == 0) {
			System.out.println(-1);
		}
	}
}