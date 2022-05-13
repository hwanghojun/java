package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork10_2 {

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
		result(num,arNum);
	}
	
	public static void result(int a,double arr [][]) {
		System.out.println(a + "학년 " + "1학기 : "+arr[a-1][0]);
		System.out.println(a + "학년 " + "2학기 : "+arr[a-1][1]);
	}
	
}
	