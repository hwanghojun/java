package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork04_2 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		System.out.println("Korea,China,Vietnam �� �ϳ��� �Է��Ͻÿ�.");
		
		String country = HH.nextLine();
		
		switch(country) {
			case "Korea" :
			case "korea" :
				System.out.println("���ѹα�");
				break;
			case "China" :
			case "china" :
				System.out.println("�߱�");
				break;
			case "Vietnam" :
			case "vietnam" :
				System.out.println("��Ʈ��");
				break;
			default :
				System.out.println("�ش����");
				break;
		}
		

	}

}
