package org.java_code.preTest03;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		char [] array = {'a','b','c','d'}; 
		Scanner scn = new Scanner(System.in);
		System.out.println("n?"); 
		int n = scn.nextInt(); 
		try {
			System.out.println(array[n]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 발생");
		}
	}
	
	
}
