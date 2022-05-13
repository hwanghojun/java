package org.java_code.preTest02;

import java.util.Scanner;

public class pretest04 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int arr [] = {10,2,5,8,10};
		System.out.println("몇 번째 원소를 출력할까요?");
		int myNum=HH.nextInt();
		try {
			System.out.println("해당하는 수는"+arr[myNum]+"입니다.");
		} catch (Exception e) {
			System.out.println("범위를 벗어났습니다.");
		}
		
	}

}
