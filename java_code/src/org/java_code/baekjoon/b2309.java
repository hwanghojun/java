package org.java_code.baekjoon;

import java.util.Scanner;
import java.util.Arrays;
public class b2309 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int Dwarf[] = new int[9];
		for (int i = 0; i < 9; i++) {
			Dwarf[i] = HH.nextInt();
		}
		while (true) {
			int sum = 0;
			for (int i = 0; i < 7; i++) {
				sum += Dwarf[i];
			}
			if (sum == 100)break;
			int N = (int) (Math.random() * 9);
			int temp = Dwarf[0];
			Dwarf[0] = Dwarf[N];
			Dwarf[N] = temp;
		}
		for (int i = 7; i < 9; i++) {
				Dwarf[i]=0;
		}
		Arrays.sort(Dwarf);
		for (int i = 2; i < 9; i++) {
			System.out.println(Dwarf[i]);
		}
	}
}
