package org_java_code.Method;

import java.util.Scanner;

public class Method6 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		char a = HH.next().charAt(0);
		System.out.println(result(a));

	}
	
	public static int result(char c) {
		return (int)c;
	}
}
