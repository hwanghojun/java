package org.java.code_test;

import java.util.Scanner;

public class middleTest1_6 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("6¹ø");
		int[] ar = new int[5];
		for(int i=0; i<5;i++) {
			int a = HH.nextInt();
			ar[i]=a;
		}
		System.out.print("¿ª¼ø:");
		for(int j=4; j>=0; j--) {
			System.out.print(ar[j]);
		}
		
	}

}
