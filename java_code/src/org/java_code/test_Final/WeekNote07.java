package org.java_code.test_Final;

import java.util.Scanner;

public class WeekNote07 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		//5-1 소수
		//5-5 최대공약수 최소공배수
		//6-2 quit if(Small.equals("quit")) break;
		//이중배열 array5
		// Str을 char로 형변환
		String A = "A";
		char B = A.charAt(0);
		
		//행열 기본
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(B);
			}System.out.println();
		}
		
		//랜덤알파벳 (대문자는 A:65 Z:90소문자는 a:97 z:122) 32 25
		char C = (char)(int)(Math.random()*26+65);
		System.out.println(C);
		
		
		//'quit'입력시 종료
		while(true) {
			String Small = HH.nextLine();
		if(Small.equals("quit")) break;
		}
		
		//switch
		int month = HH.nextInt();
		 
		 switch(month) {
		 	case 1,3,5,7,8,10,12  :
		 		System.out.println("31");
		 		break;
		 	case 4,6,9,11 :
		 		System.out.println("30");
		 		break;
		 	case 2 :
		 		System.out.println("28");
		 		break;
		 	default:
		 		System.out.println("잘못된 값");
		 		break;
		 }
	
	}
}
