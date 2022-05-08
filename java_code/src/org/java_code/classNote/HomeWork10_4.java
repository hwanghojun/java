package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork10_4 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오. ");
		char first = HH.next().charAt(0);
		result(first);
	}
	
	public static void result(char a) {
		char arr []=new char[a-64];
		int n=0;
		for(int i=65;i<=a;i++) {
			if(i<=a) {
				arr[n]=(char)i;
				String result = String.valueOf(arr);
				System.out.println(result);
			}n++;
		}
		
	}
	
}
