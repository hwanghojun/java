package org.java_code.preTest02;

import java.util.Scanner;

public class pretest01 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		
		int num1 = HH.nextInt();
		int num2 = HH.nextInt();
		try {
			System.out.print(num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생");
		}
	}

}
