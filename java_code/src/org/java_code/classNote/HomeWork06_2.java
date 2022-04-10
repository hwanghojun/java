package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_2 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오. ('quit'입력시 종료)");
			char first = 'z';
			while(true) {
			
				String Small = HH.nextLine();
				if(Small.equals("quit")) break;
				
				char alpa = Small.charAt(0);
			if(alpa<=first) {
				 first =alpa;
			}else{alpa = first;}
		
			
			}System.out.println("가장 빠른 알파벳은 "+first+"이다.");
			
	}	
		
		
		
}
