package org.java_code.baekjoon;

import java.util.Scanner;

public class b2789 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String letter = HH.next();
		char arr1[] = letter.toCharArray();
		char arr2[] = "CAMBRIDGE".toCharArray();
		int stop = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					stop = j;
					break;
				}
			}
			if (arr1[i] != arr2[stop]) {
				System.out.print(arr1[i]);
			}
		}
	}

}
// replaceAll �޼ҵ� : ���ڿ����� Ư�����ڸ� �ٸ� ���ڷ� ��ü ġȯ�ϴ� �޼ҵ� -> CAMBRIDGE ���ڿ��� �������� ����ϵ�����