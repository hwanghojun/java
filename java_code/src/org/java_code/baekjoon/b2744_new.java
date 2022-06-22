package org.java_code.baekjoon;

import java.util.Scanner;

public class b2744_new {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String A = HH.next();
		String B = HH.next();
		
		A.toUpperCase();
		B.toUpperCase();
		if(A.equalsIgnoreCase(B)) {System.out.println("같습니다.");}
		
		//ignorecase 대소문자 구분없이 비교 

	}

}
