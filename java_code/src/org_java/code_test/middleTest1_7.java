package org_java.code_test;

import java.util.Scanner;

public class middleTest1_7 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("7��");
		int a = HH.nextInt();
		int b= a%3;
		switch(b) {
		case 0:
			System.out.println("3�� ���");
			break;
		case 1, 2:
			System.out.println("3�� ��� �ƴ�");
		break;
		default:
			System.out.println("����");
			break;
		}
		
		
	}

}
