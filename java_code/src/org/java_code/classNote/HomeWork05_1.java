package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork05_1 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		System.out.println("������)");
		int i = HH.nextInt();
		//string
		String a = "";
		if(i%10==2 ||i%10==4 ||i%10==5 ||i%10==9) {
			 a = "�� ";
		}else { a = "�� ";}
		//�Ҽ�
		if(i == 1) {
			System.out.println(i+"�� �Ҽ��� �ƴմϴ�.");
		}else if(i == 2) {
			System.out.println(i+"�� �Ҽ��Դϴ�.");
		}else{
			for(int n = 2; n<i; n++) {
			if(i%n == 0) {
			 System.out.println(i+a+"�Ҽ��� �ƴմϴ�."); 
			 return;
		 } 	
		}System.out.println(i+a+"�Ҽ��Դϴ�."); 
		}		
		}
	}
