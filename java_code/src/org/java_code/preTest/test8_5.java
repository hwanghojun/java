package org.java_code.preTest;

import java.util.Scanner;

public class test8_5 {

	public static void main(String[] args) {
		//소문자 알파벳을 반복적으로 입력받다가 소문자 알파벳이 아니면 종료하시오.
		Scanner HH = new Scanner(System.in);
		
		while(true){
			char myStr = HH.next().charAt(0);
			int mySecStr = (int)myStr;
			if(mySecStr<97 || mySecStr>122) break;
			
		}
		System.out.println("종료");
		
	}

}
