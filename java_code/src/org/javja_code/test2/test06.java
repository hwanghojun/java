package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test06 {

	public static void main(String[] args) {
		//6¹ø
		Scanner HH = new Scanner(System.in);
//		System.out.println();
		char [] arr = {'A','B','C'};
		int num = HH.nextInt();
		try {
			System.out.println(arr[num]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
		}

		
	}

	
//	public static   AA() {
//	
//	}
}

//for(int i=0;i<5;i++) {
//	for(int j=0;j<5;j++) {
//		System.out.print();
//	}System.out.println();
//}