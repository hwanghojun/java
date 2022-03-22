package org.java_code.condition;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner HH = new Scanner (System.in);
		
		int a = HH.nextInt(), b = HH.nextInt(), c = HH.nextInt(); 
		int max;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		if (a>b && a>c) {
//			System.out.println("가장 큰 수는"+a);
			max = a;
		}
		else if (b>c) {
//			System.out.println("가장 큰 수는"+b);
			max = b;
	    }
		else {
//			System.out.println("가장 큰 수는"+c);
			max = c;
		}
		System.out.println("가장 큰 수는"+max);
	}
}
