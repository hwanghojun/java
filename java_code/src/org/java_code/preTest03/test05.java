package org.java_code.preTest03;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arr [][]=new int[5][5];
		System.out.println("실행 결과");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=(int)(Math.random()*2);
				System.out.print(arr[i][j]);
			}System.out.println();
		}
		
		System.out.println("0과 1중 입력하시오. ");
		int a = HH.nextInt();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]==a) {
				System.out.print(arr[i][j]);}
				else {System.out.print(" ");}
			}System.out.println();
		}
		
	}
	
	
}
