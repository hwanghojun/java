package org.java_code.baekjoon;

import java.util.Scanner;

public class b25304 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int X =HH.nextInt();
		int N =HH.nextInt();
		int sum=0;
		for(int i=0; i<N;i++) {
			int a =HH.nextInt();
			int b =HH.nextInt();
			sum+=a*b;
		}
		if(sum==X) {System.out.println("Yse");}
		else {System.out.println("No");}
	}

}
