package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork10_1 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("ù��° ���ڿ� ? ");
		String a1 = HH.next();
		System.out.println("�ι�° ���ڿ� ? ");
		String a2 = HH.next();
		System.out.println("��� : "+result(a1,a2));
	}
	
	public static String result(String a,String b) {
		return a+b;
	}
	
}
