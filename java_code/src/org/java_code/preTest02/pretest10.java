package org.java_code.preTest02;

import java.util.Scanner;

public class pretest10 {

	public static void main(String[] args) {
		Scanner HH=new Scanner(System.in);
		int a = HH.nextInt();
		int sum=0;
		if(odd(a)) System.out.println("Ȧ�� ����");
		else System.out.println("Ȧ���ƴ�");
		for(int i=0; i<=a;i++) {
			sum=i+sum;
		}
		
		System.out.println("1���� "+a+"������ ����"+sum);
		
	}
	public static boolean odd(int n) {
		return n%2==1;
	}

}
