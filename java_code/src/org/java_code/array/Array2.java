package org.java_code.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner HH = new Scanner(System.in);
		
		
		String[] arSubject = {"국어","영어","수학","과학"};
		int [] arScore = {100,80,90,95};
		
		while(true) {
			System.out.println("과목명을 입력하세요. ");
			String mySubject = HH.nextLine();
			
			for(int i=0; i<arSubject.length;i++) {
				if(arSubject[i].equals(mySubject))
				System.out.println(arSubject[i]+"의 점수는 :"+arScore[i]);
			}
			
			if(mySubject.equals("그만")) break;
		}
		
		
	}

}
