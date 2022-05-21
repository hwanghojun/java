package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
		//3¹ø
		Scanner HH = new Scanner(System.in);
		int [] arr= {3,6,2,8,1};
		ascending_order(arr);
		
	}
	
	
	public static void ascending_order(int n []) {
		 	Arrays.sort(n);
			for(int i=0;i<n.length;i++) {
		 	System.out.print(n[i]);}
	}
}

//for(int i=0;i<5;i++) {
//	for(int j=0;j<5;j++) {
//		System.out.print();
//	}System.out.println();
//}