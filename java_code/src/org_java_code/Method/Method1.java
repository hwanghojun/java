package org_java_code.Method;

import java.util.Scanner;

public class Method1 {
	
	public static int add(int a,int b) {
		return a+b;
		
	}
	public static int sub(int a,int b) {
		return a-b;
		
	}
	public static int mul(int a,int b) {
		return a*b;
		
	}public static double div(int a,int b) {
			return (double)a/(double)b;
			}
	
	
	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		
		int a = HH.nextInt();
		int b = HH.nextInt();
		
		System.out.println("두 수의 합은"+add(a,b));
		System.out.println("두 수의 차는"+sub(a,b));
		System.out.println("두 수의 곱은"+mul(a,b));
		System.out.println("두 수의 나눈셈은"+div(a,b));
	}

}
