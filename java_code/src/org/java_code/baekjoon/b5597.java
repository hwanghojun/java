package org.java_code.baekjoon;

import java.util.Scanner;

public class b5597 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int check[] = new int[30];
		
		for (int i = 1; i < 29; i++) {
			int std =HH.nextInt();
			check[std-1]=1;
		}
		for(int i=0;i<30;i++) {
			if(check[i]!=1) {
				System.out.println(i+1);
			}
		}

	}

}
