package org.java_code.baekjoon;

import java.util.Scanner;

public class b2920 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String A = HH.next();
		if(A.equals("12345678")) {
			System.out.println("ascending");
		}else if(A.equals("87654321")) {
			System.out.println("discending");
		}else {System.out.println("mixed");}

	}

}
