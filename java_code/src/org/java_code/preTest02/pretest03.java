package org.java_code.preTest02;

import java.util.Scanner;

public class pretest03 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�. ");
		int a=HH.nextInt();
		int b=HH.nextInt();
		int c=HH.nextInt();
		System.out.println("������"+sum(a,b,c));
		System.out.println("�����"+avg(a,b,c));

	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int avg(int a,int b,int c) {
		return (a+b+c)/3;
	}

}
