package org.java_code.preTest03;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int a = HH.nextInt();
		
		System.out.println(a+"!은 "+fac(a)+"입니다.");
	}
	public static int fac(int a) {
		int result=1;
		for (int i=1;i<=a;i++) {
			result=result*i;
		}
		return result;
	}
}
