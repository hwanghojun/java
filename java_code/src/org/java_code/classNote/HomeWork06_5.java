package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_5 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("60161362 Ȳȣ��");
		int num = (int)(Math.random()*10)+1;
		
		System.out.println("���ڸ� ���纸����. ");
		while(true) {
			int myNumber = HH.nextInt();
			if(myNumber>num) {
				System.out.println("������ ���ڴ� "+myNumber+" ���� �۴�");
			}if(myNumber<num) {
				System.out.println("������ ���ڴ� "+myNumber+" ���� ũ��");
			}if(myNumber==num) break;
		}
		System.out.println("�¾ҽ��ϴ�.");
	}	
	
}
