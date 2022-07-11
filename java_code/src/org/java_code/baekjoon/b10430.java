package org.java_code.baekjoon;

import java.util.Scanner;

public class b10430 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int A = HH.nextInt();
		int B = HH.nextInt();
		int C = HH.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);

	}

}
