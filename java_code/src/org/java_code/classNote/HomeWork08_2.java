package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork08_2 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arNum[][] = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arNum[i][j]= (int)(Math.random()*10);
				System.out.print(arNum[i][j]+" ");
			}System.out.println();
		}
		System.out.print("숫자를 입력하시오.");
		int num = HH.nextInt();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arNum[i][j]<num) {
					System.out.print("X ");
				}else {System.out.print(arNum[i][j]+" ");}
			}System.out.println();
		}
	}

}
