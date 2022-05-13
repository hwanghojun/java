package org.java_code.preTest;

import java.util.Scanner;

public class test8_4 {

	public static void main(String[] args) {
		//컴퓨터 A,B,C 중하나를 선택하고 사용자가 맞추도록 하시오.
		Scanner HH = new Scanner(System.in);
		
		int cum = (int)(Math.random()*3);
		System.out.println("ABC 중 맞추시오");
		String cumStr="";
		
		if(cum==0) {
			cumStr="A";
		}else if(cum==1) {
			cumStr="B";
		}else {
			cumStr="C";
		}
		char cumSecStr = cumStr.charAt(0);
		while(true){
			String subStr =HH.nextLine();
			char secStr = subStr.charAt(0);
			int myStr =(int)secStr;
			if(cumSecStr!=myStr) {
				System.out.println("틀렸습니다. 다시 입력하시오.");
			}if(cumSecStr==myStr) {
				System.out.println("정답");
			}
		}
				

	}

}
