package org_java_code.test;

import java.util.Scanner;

public class test6_1 {

	public static void main(String[] args) {
		//���⹮�� 7��
		Scanner HH = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1+2*j+"  ");
			}System.out.println();
		}
		
		System.out.println();
		//2���� �迭�̶� �迭�Ⱦ� �迭�� �ִ� �迭�̴�.
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
