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
		
		System.out.println("�� ���� ����"+add(a,b));
		System.out.println("�� ���� ����"+sub(a,b));
		System.out.println("�� ���� ����"+mul(a,b));
		System.out.println("�� ���� ��������"+div(a,b));
	}

}
