package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork10_1 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("첫번째 문자열 ? ");
		String a1 = HH.next();
		System.out.println("두번째 문자열 ? ");
		String a2 = HH.next();
		System.out.println("결과 : "+result(a1,a2));
	}
	
	public static String result(String a,String b) {
		return a+b;
	}
	
}
