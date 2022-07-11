package org.java_code.study;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String A = HH.next();
		int i=0;
		int j=10;
		while (true) {
			System.out.println(A.substring(i+=10,j+=10));
			if(j>A.length()-10)break;
		}
		
		
	}

}
