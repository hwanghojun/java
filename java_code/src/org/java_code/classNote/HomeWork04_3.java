package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork04_3 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);	
		System.out.println("A~Z�� ���� �ϳ��� �Է��Ͻÿ�.");
		
		char me = HH.nextLine().charAt(0); 
		System.out.println("������");
		System.out.println("�� :"+me);
		
		char computer = (char)(Math.random()*26+65);
		System.out.println("��ǻ�� :"+computer);
		
		if(me<=computer) {
			  System.out.print(me);
			  System.out.println(computer);
		} 
		else {
			System.out.print(computer);
			System.out.println(me);
		}

	}

}
