package org.java_code.classNote;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		//5번 기출문제
		Scanner HH = new Scanner(System.in);
		System.out.println("수를 입력하시오.");
		int a = HH.nextInt();
//		int a = (int)(Math.random()*8+2);
//		System.out.println("수를 입력하시오"+a);
		int result = 0;
		for (int i = 1; i < 10; i++) {
			if (a >= 2 && a < 10) {
				result = a * i;
				System.out.println(a + "x" + i + "=" + result);
			} else {
				System.out.println("2-9사이의 숫자를 입력하세요.");
			}
		}

	}

}
