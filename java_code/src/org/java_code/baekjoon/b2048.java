package org.java_code.baekjoon;

import java.util.Scanner;

public class b2048 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int dice1 = HH.nextInt();
		int dice2 = HH.nextInt();
		int dice3 = HH.nextInt();
		int result = 0;
		System.out.println(dice1 +" " + dice2+" " + dice3);
		if(dice1==dice2&& dice2==dice3) {
			result = 10000+dice1*1000;
		}else if(dice1 == dice2 || dice2 == dice3 ) {
			result = 10000+dice2*100;
		}else if(dice1 == dice2 || dice1 == dice3) {
			result = 10000+dice1*100;
		}
	}

}
