package org.java_code.baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class b2309_new {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int Dwarf[] = new int[9];
		int sum=0;
		for (int i = 0; i < 9; i++) {
			sum+= (Dwarf[i] = HH.nextInt());
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i!=j & sum-Dwarf[i]-Dwarf[j]==100) {
					Dwarf[i]=Dwarf[j]=0;
					Arrays.sort(Dwarf);
					break;
					}
				}
				if(Dwarf[0]==0)break;
			}
		System.out.println(sum);
		for(int k=2;k<9;k++) {
			System.out.println(Dwarf[k]);
		}
	}
}
