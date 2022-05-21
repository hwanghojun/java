package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test02 {

	public static void main(String[] args) {
		//2번
		Scanner HH = new Scanner(System.in);
		int num = HH.nextInt();
		if(is_prime(num)) {
			System.out.println("소수");
		}else {System.out.println("소수아님");}
		
	}
	
	
	public static boolean  is_prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

//for(int i=0;i<5;i++) {
//	for(int j=0;j<5;j++) {
//		System.out.print();
//	}System.out.println();
//}
