package org.java_code.classNote;

import java.util.Scanner;

public class WeekNote07 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		// Str�� char�� ����ȯ
		String A = "A";
		char B = A.charAt(0);
		
		//�࿭ �⺻
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(B);
			}System.out.println();
		}
		
		//�������ĺ� (�ҹ��ڴ� a:97 z:122)
		char C = (char)(int)(Math.random()*25+65);
		System.out.println(C);
		
		
		//'quit'�Է½� ����
		while(true) {
			String Small = HH.nextLine();
		if(Small.equals("quit")) break;
		}
	}

}
