package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_2 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��Ͻÿ�. ('quit'�Է½� ����)");
			char first = 'z';
			while(true) {
			
				String Small = HH.nextLine();
				if(Small.equals("quit")) break;
				
				char alpa = Small.charAt(0);
			if(alpa<=first) {
				 first =alpa;
			}else{alpa = first;}
		
			
			}System.out.println("���� ���� ���ĺ��� "+first+"�̴�.");
			
	}	
		
		
		
}
