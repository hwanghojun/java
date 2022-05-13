package org.java_code.preTest02;

import java.util.Scanner;

public class pretest05 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arr [][]=new int[3][3];
		int result=0;
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"번째 학생 점수는?");
			for(int j=0;j<3;j++) {
				arr[i][j]=HH.nextInt();
				if(result<=arr[i][j]) {
					result=arr[i][j];
				}
			}
		}
		System.out.println("최고점은?"+result);
	}

}
