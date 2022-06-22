package org.java_code.baekjoon;

import java.util.Scanner;

import java.util.Arrays;

public class b5597_new {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arr[]=new int[10];
		int arr2[]=new int[8];
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<8;i++) {
			arr2[i]=HH.nextInt();
		}
		Arrays.sort(arr2);
		for(int i=1;i<11;i++) {
			if(arr[i-1]!=i) {
				System.out.println(arr[i]);
			}
		}
	
	}	

}
