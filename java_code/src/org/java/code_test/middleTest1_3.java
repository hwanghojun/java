package org.java.code_test;

import java.util.Scanner;

public class middleTest1_3 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("3번");
		System.out.print("숫자 입력: ");
		int first = HH.nextInt();
		int min = first;
		int max = first;
		for(int i=0; i<4; i++) {
			first = HH.nextInt();
			if(first >max) {
				max=first;
			}if(first <min) {
				min = first;
			}
		
		}System.out.println("최소 :"+min+"최대 :"+max);
		
		
		
	}

}
