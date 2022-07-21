package org.java_code.baekjoon;

import java.util.Scanner;

public class b9517 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int player= HH.nextInt();
		int N = HH.nextInt();
		int time = 0;
		for (int i = 0; i < N; i++) {
			int T = HH.nextInt();
			char Z = HH.next().charAt(0);
			time += T;
			if (time > 210)
				continue;
			if (Z == 'T') {
				player++;
				if (player == 9) {
					player = 1;
				}
			}
		}
		System.out.println(player);
	}
}
// Integer.parseInt : spring 타입을 int 타입으로 변환