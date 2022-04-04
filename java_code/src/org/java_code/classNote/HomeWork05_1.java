package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork05_1 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		System.out.println("실행결과)");
		int i = HH.nextInt();
		//string
		String a = "";
		if(i%10==2 ||i%10==4 ||i%10==5 ||i%10==9) {
			 a = "는 ";
		}else { a = "은 ";}
		//소수
		if(i == 1) {
			System.out.println(i+"은 소수가 아닙니다.");
		}else if(i == 2) {
			System.out.println(i+"는 소수입니다.");
		}else{
			for(int n = 2; n<i; n++) {
			if(i%n == 0) {
			 System.out.println(i+a+"소수가 아닙니다."); 
			 return;
		 } 	
		}System.out.println(i+a+"소수입니다."); 
		}		
		}
	}
