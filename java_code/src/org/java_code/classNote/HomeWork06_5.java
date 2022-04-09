package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_5 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("60161362 황호준");
		int num = (int)(Math.random()*10)+1;
		
		System.out.println("숫자를 맞춰보세요. ");
		while(true) {
			int myNumber = HH.nextInt();
			if(myNumber>num) {
				System.out.println("임의의 숫자는 "+myNumber+" 보다 작다");
			}if(myNumber<num) {
				System.out.println("임의의 숫자는 "+myNumber+" 보다 크다");
			}if(myNumber==num) break;
		}
		System.out.println("맞았습니다.");
	}	
	
}
