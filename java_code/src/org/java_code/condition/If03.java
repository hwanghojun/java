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
//			System.out.println("���� ū ����"+a);
			max = a;
		}
		else if (b>c) {
//			System.out.println("���� ū ����"+b);
			max = b;
	    }
		else {
//			System.out.println("���� ū ����"+c);
			max = c;
		}
		System.out.println("���� ū ����"+max);
	}
}
