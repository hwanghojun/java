package org_java_code.test;

import java.util.Scanner;

public class test5 {
	
	public static void main(String[] args) {
		//���� 5���� �迭�� �Է¹ް� ����, ����� �� �߿� ���� ū ���� ����Ͻÿ�.
		Scanner HH = new Scanner(System.in);
		int firstNum = 0;
		int[] arNum = new int[5];
		
		System.out.println("�ټ����� ���� �Է��Ͻÿ�.");
		for(int i=0;i<5;i++) {
			int myNum = HH.nextInt();
			arNum[i] = myNum;
			if(myNum>firstNum) {
				firstNum = myNum;
			}
		}System.out.println("���� ū ���� "+firstNum);

	}

}
