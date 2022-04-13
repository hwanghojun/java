package org.java_code.classNote;

import java.util.Scanner;

public class WeekNote07 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		// Str을 char로 형변환
		String A = "A";
		char B = A.charAt(0);
		
		//행열 기본
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(B);
			}System.out.println();
		}
		
		//랜덤알파벳 (소문자는 a:97 z:122)
		char C = (char)(int)(Math.random()*25+65);
		System.out.println(C);
		
		
		//'quit'입력시 종료
		while(true) {
			String Small = HH.nextLine();
		if(Small.equals("quit")) break;
		}
	}

}
