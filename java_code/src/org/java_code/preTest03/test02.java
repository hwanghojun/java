package org.java_code.preTest03;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int a = HH.nextInt();
		if(odd_even(a)==true) {
			System.out.println("¦��");
		}else {System.out.println("Ȧ��");}

	}
	
	public static boolean odd_even(int n) {
		return n%2==0;
	}
	
}
