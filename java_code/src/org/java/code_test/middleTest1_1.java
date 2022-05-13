package org.java.code_test;

import java.util.Scanner;

public class middleTest1_1 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("1¹ø");
		int a = HH.nextInt();
		
		
		int result= 1;
		for(int i=1;i<=a;i++) {
			result=result*i;
		}System.out.println(a+"! = "+result);
		
		
	}

}
