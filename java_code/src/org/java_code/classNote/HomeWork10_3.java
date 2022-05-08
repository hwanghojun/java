package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork10_3 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int num [] = new int [5];
		for(int i=0;i<num.length;i++) {
			num[i]=HH.nextInt();
		}	
		System.out.println("ÃÖ´ñ°ªÀº :"+get_max(num));
	}
	
	public static int get_max(int num []) {
		int a=0;
		for(int i=0;i<num.length;i++) {
			if(a<num[i]) a=num[i];
		}
		return a;
	}
	
}
