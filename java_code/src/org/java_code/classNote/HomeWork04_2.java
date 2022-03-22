package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork04_2 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		System.out.println("Korea,China,Vietnam 중 하나를 입력하시오.");
		
		String country = HH.nextLine();
		
		switch(country) {
			case "Korea" :
			case "korea" :
				System.out.println("대한민국");
				break;
			case "China" :
			case "china" :
				System.out.println("중국");
				break;
			case "Vietnam" :
			case "vietnam" :
				System.out.println("베트남");
				break;
			default :
				System.out.println("해당없음");
				break;
		}
		

	}

}
