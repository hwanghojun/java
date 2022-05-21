package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test10 {

	public static void main(String[] args) {
		//10¹ø
		Scanner HH = new Scanner(System.in);
		int num = HH.nextInt();
		System.out.println(sum(num));
		
	}


	
	public static int  sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
}

//for(int i=0;i<5;i++) {
//	for(int j=0;j<5;j++) {
//		System.out.print();
//	}System.out.println();
//}