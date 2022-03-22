package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork04_4 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		int month = HH.nextInt();
		switch(month) {
			case 1: case 3: case 5: case 7: case 8:
			case 10: case 12:
				System.out.println(month+"월의 말일은 31일입니다.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(month+"월의 말일은 30일입니다.");
				break;
			case 2:
				System.out.println(month+"월의 말일은 28일입니다.");
				break;
			default:
				System.out.println("잘못된 값");
				break;
		}
		

	}

}
