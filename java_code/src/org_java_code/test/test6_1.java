package org_java_code.test;

import java.util.Scanner;

public class test6_1 {

	public static void main(String[] args) {
		//기출문제 7번
		Scanner HH = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1+2*j+"  ");
			}System.out.println();
		}
		
		System.out.println();
		//2차원 배열이란 배열안애 배열이 있는 배열이다.
		int[][] arNum = new int[5][5];
		for(int a=0;a<5;a++) {
			for(int b=0;b<5;b++) {
				int myNum = HH.nextInt();
				arNum[a][b] = myNum;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arNum[i][j]+" ");
			}System.out.println();
		}
	}

}
