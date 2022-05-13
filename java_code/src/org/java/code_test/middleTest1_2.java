package org.java.code_test;

import java.util.Scanner;

public class middleTest1_2 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("2번");
		System.out.println("입력: ");
		int a = HH.nextInt();
		if(a>0 && a<27) {
			int b = a+64;
		System.out.println((char)b);
		}else {System.out.println(("1부터 26사이의 숫자를 입력하시오."));}
		
		
	}

}
