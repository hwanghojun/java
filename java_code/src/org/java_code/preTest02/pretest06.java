package org.java_code.preTest02;

import java.util.Scanner;

public class pretest06 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		char arr [][]=new char[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				char alpa=(char)(Math.random()*3+65);
				arr[i][j]=alpa;
				System.out.print(arr[i][j]);
			}System.out.println();
		}
		System.out.println("문자를 입력하시오.");
		char A=HH.next().charAt(0);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]==A) {
				System.out.print(arr[i][j]);}
				else {System.out.print(" ");}
			}System.out.println();
		}
		
	}

}
