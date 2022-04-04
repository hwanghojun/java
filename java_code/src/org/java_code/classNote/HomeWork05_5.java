package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork05_5 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		System.out.print("두 수를 입력하시오 :");
		int num1 = HH.nextInt();
		int num2 = HH.nextInt();
		int result1 = 0;
		int result2 = 0;
		for (int i = 2; i <= num1 && i <= num2;) {
			if (num1 % i == 0 && num2 % i == 0)
				result1 = i;
				i++;
		}
		System.out.println("최대공약수 :" + result1);
			result2 = (num1*num2)/result1;
		System.out.println("최소공배수 :"+result2);
	}
	

}
