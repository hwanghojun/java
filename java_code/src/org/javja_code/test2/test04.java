package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test04 {

	public static void main(String[] args) {
		//4번
		Scanner HH = new Scanner(System.in);
		double arNum[][] = new double[4][2];
		double Num[][] = new double[4][1];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println((i + 1) + "학년" + (j + 1) + "학기");
				arNum[i][j] = HH.nextDouble();
			}
		}
		System.out.print("평점");
		for(int i=0;i<4;i++) {
			for(int j=0;j<1;j++) {
				Num[i][j]=(arNum[i][j]+arNum[i][j+1])/2;
				System.out.println((i+1)+"학년"+Num[i][j]);
			}
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