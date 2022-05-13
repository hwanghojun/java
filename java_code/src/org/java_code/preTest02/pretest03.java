package org.java_code.preTest02;

import java.util.Scanner;

public class pretest03 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("세 수를 입력하시오. ");
		int a=HH.nextInt();
		int b=HH.nextInt();
		int c=HH.nextInt();
		System.out.println("총합은"+sum(a,b,c));
		System.out.println("평균은"+avg(a,b,c));

	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int avg(int a,int b,int c) {
		return (a+b+c)/3;
	}

}
