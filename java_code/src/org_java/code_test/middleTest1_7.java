package org_java.code_test;

import java.util.Scanner;

public class middleTest1_7 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("7번");
		int a = HH.nextInt();
		int b= a%3;
		switch(b) {
		case 0:
			System.out.println("3의 배수");
			break;
		case 1, 2:
			System.out.println("3의 배수 아님");
		break;
		default:
			System.out.println("오류");
			break;
		}
		
		
	}

}
