package org.java_code.baekjoon;

import java.util.Scanner;

public class b2744 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String st = HH.next();

		
		char S[] = new char[st.length()];
		
		
		
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= 90) {
				S[i] = (char)(Character.toUpperCase(st.charAt(i))); 				//(st.charAt(i) -32 );
			} else {
				S[i] = (char)(Character.toLowerCase(st.charAt(i))); 				//(st.charAt(i) + 32);
			}
		}
		System.out.println(String.valueOf(S));
	}

}
//  자바 대소문자 확인 함수  ex) Character.isUppercase  isDigit-> 슛자
// 대소문자 변환 함수 toUpperCase() or toLowerCase()