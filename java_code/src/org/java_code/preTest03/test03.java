package org.java_code.preTest03;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner HH =new Scanner(System.in);
		char ch1 = HH.next().charAt(0);
		char c2 = HH.next().charAt(0);
		print_ascii(ch1,c2);
	}
	
	public static void print_ascii(char ch1,char c2) {
		
		System.out.println((int)ch1+" "+(int)c2);
	}

}
