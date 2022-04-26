package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork08_3 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		double arNum[][] = new double[4][2];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println((i + 1) + "학년" + (j + 1) + "학기");
				arNum[i][j] = HH.nextDouble();
			}
		}
		System.out.print("학년을 입력하시오.");
		int num = HH.nextInt();
		int a = 1;
		while (true) {
			System.out.println(num + "학년 " + a + "학기 : " + arNum[num - 1][a - 1]);
			a++;
			if(a==3) break;
		}
	}
}
