package org.java_code.preTest03;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int n = HH.nextInt();
		for(int i=1;i<=n;i++) {
			if(i!=1 && n%i==0) {
				if(i==n) {System.out.println("�Ҽ��Դϴ�.");}
				else{System.out.println(i+"�� ����Դϴ�.");} 
				break;
				}
		}
		
	}

}
