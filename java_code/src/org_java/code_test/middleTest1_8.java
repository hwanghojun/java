package org_java.code_test;

import java.util.Scanner;

public class middleTest1_8 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("8번");
		//4번째
		for(int t=0; t<5; t++) {
			for (int y=0; y<=t; y++) {
				if(t%2!=0) {
				System.out.print("X ");
				}else {System.out.print("O ");}
			}
			System.out.println();
		}
		
		//3번쨰
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if(i==4 && j==4) {System.out.print(("4.5"));	
				}else{System.out.print((i+1)+"."+(j+1)+" ");}
			}System.out.println();
		}
		
		
	}

}
