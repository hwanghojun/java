package org_java_code.test;

import java.util.Scanner;

public class test5 {
	
	public static void main(String[] args) {
		//정수 5개를 배열에 입력받고 나서, 저장된 수 중에 가장 큰 수를 출력하시오.
		Scanner HH = new Scanner(System.in);
		int firstNum = 0;
		int[] arNum = new int[5];
		
		System.out.println("다섯개의 수를 입력하시오.");
		for(int i=0;i<5;i++) {
			int myNum = HH.nextInt();
			arNum[i] = myNum;
			if(myNum>firstNum) {
				firstNum = myNum;
			}
		}System.out.println("가장 큰 수는 "+firstNum);

	}

}
