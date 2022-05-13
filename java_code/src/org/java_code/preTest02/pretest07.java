package org.java_code.preTest02;

import java.util.Scanner;

public class pretest07 {

	public static void main(String[] args) {
		Scanner HH =new Scanner(System.in);
		int arr1[][] = new int[2][3];
		int arr2[][] = new int[2][3];
		System.out.println("첫 번째 배열 원소를 입력하시오. ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr1[i][j]=HH.nextInt();
			}
		}
		System.out.println("두 번째 배열 원소를 입력하시오. ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j]=HH.nextInt();
			}
		}
		System.out.println("배열1");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]);
			}System.out.println();
		}
		System.out.println("배열2");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]);
			}System.out.println();
		}
		System.out.println("배열 합");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+arr2[i][j]);
			}System.out.println();
		}
	}

}
