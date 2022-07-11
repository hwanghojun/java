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
// replaceAll 메소드 : 문자열에서 특전문자를 다른 문자로 전체 치환하는 메소드 -> CAMBRIDGE 문자열을 공백으로 출력하도록함