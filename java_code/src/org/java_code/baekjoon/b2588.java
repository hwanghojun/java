package org.java_code.baekjoon;

import java.util.Scanner;

public class b2588 {
	
	public static void main(String[] args ) {
		Scanner HH = new Scanner(System.in);
		int A= HH.nextInt();
		int B= HH.nextInt();
		System.out.println(A*(B%10));
		System.out.println((A*(B%100-B%10))/10);
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
	}
}
