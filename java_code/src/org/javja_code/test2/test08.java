package org.javja_code.test2;

import java.util.Scanner;

import java.util.Arrays;

public class test08 {

	public static void main(String[] args) {
		//8번
		Scanner HH = new Scanner(System.in);
		int arr [] = new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=HH.nextInt();
			
		}
		int c=0;
		System.out.println("숫자를 입력하시오.");
		int a =HH.nextInt();
		while(true) {
			for(int i=0;i<5;i++) {
				if(arr[i]==a) {
					c=1;
				}
			}
			if(c==1) {
				System.out.println("포함되어 있음");
			}else {System.out.println("포함되어 있지 않음");}
		}
	}

	
//	public static   AA() {
//	
//	}
}

//for(int i=0;i<5;i++) {
//	for(int j=0;j<5;j++) {
//		System.out.print();
//	}System.out.println();
//}