package org.java_code.preTest03;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arr [][]= {{70,80,80,0},{100,70,60,0},{50,50,50,0},{80,70,90,0},{50,30,80,0}};
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				arr [i][3] = arr[i][0]+arr[i][1]+arr[i][2]; 
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-4d",arr [i][j]); 
			}System.out.println();
		}
		
	}

}
