package org.java_code.preTest02;

import java.util.Scanner;

public class pretest02 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�.");
		int num=HH.nextInt();
		System.out.println("1����"+num+"������ ����"+sum(num));

	}
	
	public static int sum(int a) {
		int result=0;
		for(int i=1;i<=a;i++) {
			result= result+i;
		}
		return result;
	}

}
