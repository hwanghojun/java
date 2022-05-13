package org.java_code.preTest02;

import java.util.Arrays;

import java.util.Scanner;

public class pretest09 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arrNum1[]=new int[5];
		int arrNum2[]=new int[5];
		int arrNum3[]=new int[10];
		for(int i=1;i<3;i++) {
			System.out.println(i+"번째 배열 원소를 입력하시오.");
			for(int j=0;j<5;j++) {
				if(i==1) {
				arrNum1[j]=HH.nextInt();}
				else {
				arrNum2[j]=HH.nextInt();}
			}
		}
		for(int i=0;i<10;i++) {
			if(i<5) {
			arrNum3[i]=arrNum1[i];}
			else {arrNum3[i]=arrNum2[i-5];}
		}
		Arrays.sort(arrNum3);
		for(int i=0;i<10;i++) {
			System.out.print(arrNum3[i]+" ");}
		}	

}
