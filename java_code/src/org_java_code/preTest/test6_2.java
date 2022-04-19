package org_java_code.preTest;

import java.util.Scanner;

public class test6_2 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int[][] arNum = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int myNum = HH.nextInt();
				arNum[i][j] = myNum;
				System.out.print(arNum[i][j]+" ");
			}System.out.println();
		}
	}

}
