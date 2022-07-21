package org.java_code.baekjoon;

import java.util.Scanner;

public class b1018 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int M = HH.nextInt();
		String MN[] = new String[M];
		for (int i = 0; i < N; i++) {
			MN[i] = HH.next();
		}
		char chMN[][] = new char[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				chMN[i][j] = MN[i].charAt(j);
			}
		}
		int Nn=0;
		int Mm=0;
		int nN=8;
		int mM=8;
		int result=0;
		while(true) {
			int count = 0;
			for (int i = Nn; i < nN; i++) {
				for (int j = Mm; j < mM; j++) {
					if (((i%2 == 1 && j%2 == 1) || (i%2 == 0 && j%2 == 0)) && chMN[i][j] != 'W') {
						count++;
					}else if (((i%2 == 1 && j%2 == 0) || (i%2 == 0 && j%2 == 1)) && chMN[i][j] != 'B') {
						count++;
					}
				}
			}result=Math.min(64,count);
			count = 0;
			for (int i = Nn; i < nN; i++) {
				for (int j = Mm; j < mM; j++) {
					if (((i%2 == 1 && j%2 == 1) || (i%2 == 0 && j%2 == 0)) && chMN[i][j] != 'B') {
						count++;
					} else if (((i%2 == 1 && j%2 == 0) || (i%2 == 0 && j%2 == 1)) && chMN[i][j] != 'W') {
						count++;
					}
				}
			
		}result=Math.min(result,count);
		if(nN==N && mM == M) break;
		else if(nN<N) {Nn++; nN++;}
		else {Nn=0; nN=8; Mm++; mM++;}
		}
		System.out.println(result);
	}
}
