package org.java_code.preTest02;

import java.util.Scanner;

public class pretest04 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arr [] = {10,2,5,8,10};
		System.out.println("�� ��° ���Ҹ� ����ұ��?");
		int myNum=HH.nextInt();
		try {
			System.out.println("�ش��ϴ� ����"+arr[myNum]+"�Դϴ�.");
		} catch (Exception e) {
			System.out.println("������ ������ϴ�.");
		}
		
	}

}
