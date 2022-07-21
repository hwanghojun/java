package org.java_code.baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class b9237 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int t[] = new int[N];
		int result = 0;
		int day = 1;
		for (int i = 0; i < N; i++) {
			t[i] = HH.nextInt();
		}
		Arrays.sort(t);
		for (int i = N - 1; i >= 0; i--) {
			result = Math.max(result, day + t[i]);
			day++;
		}
		System.out.println(result + 1);
	}

}
