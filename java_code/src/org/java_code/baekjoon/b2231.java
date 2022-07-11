package org.java_code.baekjoon;

import java.util.Scanner;

public class b2231 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int result = 0;
		for (int X = 0; X < N; X++) {
			int sum=0;
			int i=X;
			while (i!=0) {
				sum +=i%10;
				i/=10;
			}
			if (N == X + sum) {
				result=X;
				break;
			}
		}
		System.out.println(result);
	}

}
