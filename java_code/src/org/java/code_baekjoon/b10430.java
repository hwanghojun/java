package org.java.code_baekjoon;

import java.util.Scanner;

public class b10430 {

	public static void main(String[] args) {
//		(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//		(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//		세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		Scanner HH = new Scanner(System.in);
		int A = HH.nextInt();
		int B = HH.nextInt();
		int C = HH.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A&C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A&C)*(B%C))%C);

	}

}
