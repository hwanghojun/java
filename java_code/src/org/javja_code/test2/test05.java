package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test05 {

	public static void main(String[] args) {
		//5¹ø
		Scanner HH = new Scanner(System.in);
		int b=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int a = (int)(Math.pow(2,j+b));
				System.out.printf("%-4d",a);
			}System.out.println();
			b++;
		}
		
		//		System.out.println();
	}
	
	
//	public static   AA() {
//	
//	}
}

