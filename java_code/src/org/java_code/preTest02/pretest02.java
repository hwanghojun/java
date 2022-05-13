package org.java_code.preTest02;

import java.util.Scanner;

public class pretest02 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("수를 입력하시오.");
		int num=HH.nextInt();
		System.out.println("1부터"+num+"까지의 합은"+sum(num));

	}
	
	public static int sum(int a) {
		int result=0;
		for(int i=1;i<=a;i++) {
			result= result+i;
		}
		return result;
	}

}
