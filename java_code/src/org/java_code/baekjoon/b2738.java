package org.java_code.baekjoon;

import java.util.Scanner;

public class b2738 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int M = HH.nextInt();
		int A [][]=new int[N][M];
		int B [][]=new int[N][M];
		int C [][]=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				A[i][j]=HH.nextInt();
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				B[i][j]=HH.nextInt();
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(C[i][j]+" ");
			}System.out.println();
		}

	}

}
