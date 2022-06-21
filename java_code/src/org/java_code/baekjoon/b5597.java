package org.java_code.baekjoon;

import java.util.Scanner;

public class b5597 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int std[] = new int[28];
		int check[] = new int[30];
		for (int i = 0; i < 28; i++) {
			int stdNumber = HH.nextInt();
			std[i]=stdNumber;
		}
		
		for (int i = 1; i < 31; i++) {
			for (int j = 0; j < 28; j++) {
				if (i == std[j]) {
					check[i-1] = 1;
					break;
				}
			}
		}
		for(int i=0;i<30;i++) {
			if(check[i]!=1) {
				System.out.println(i+1);
			}
		}

	}

}
