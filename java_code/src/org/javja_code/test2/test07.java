package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test07 {

	public static void main(String[] args) {
		//7번
		Scanner HH = new Scanner(System.in);
		int arr [][]=new int[3][3];
		int max =0;
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 학생 점수는?");
			for(int j=0;j<3;j++) {
				arr[i][j] = HH.nextInt();
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("최고점은? "+max);

		
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