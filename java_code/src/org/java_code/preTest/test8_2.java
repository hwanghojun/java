package org.java_code.preTest;

import java.util.Scanner;

public class test8_2 {

	public static void main(String[] args) {
		//���� �ټ� ���� �迭�� �Է¹ް��� ���� ���Ͻÿ�.
		Scanner HH = new Scanner(System.in);
		int[] arNum =new int[5];
		int first = 0;
		for(int i=0;i<5;i++) {
			arNum[i] = HH.nextInt();
			first=first+arNum[i];
		}System.out.println("������ "+first);
	}
	

}
