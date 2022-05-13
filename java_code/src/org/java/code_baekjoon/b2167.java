package org.java.code_baekjoon;

import java.util.Scanner;

public class b2167 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int M = HH.nextInt();
		int arNum[][] = new int[N][M];
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++) {
				int num = HH.nextInt();
				arNum[a][b] = num;
			}
		}
		int K = HH.nextInt();
		for(int q=0;q<K;q++) {
		int i = HH.nextInt();
		int j = HH.nextInt();
		int x = HH.nextInt();
		int y = HH.nextInt();
		int sum = 0;
		for (int a = i; a <= x; a++) {
			for (int b = j; b <= y; b++) {
				sum = sum + arNum[a - 1][b - 1];
			}
		}

		System.out.println(sum);
		}
	}

}