package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork04_3 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);	
		System.out.println("A~Z중 문자 하나를 입력하시오.");
		
		char me = HH.nextLine().charAt(0); 
		System.out.println("실행결과");
		System.out.println("나 :"+me);
		
		char computer = (char)(Math.random()*26+65);
		System.out.println("컴퓨터 :"+computer);
		
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
