package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_3 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		
		
		System.out.print("두 개의 자연수를 입력하시오. \n"+"첫 번째 수 :");
		int num1 = HH.nextInt();
		System.out.print("두 번째 수 :");
		int num2 = HH.nextInt();
		int btNum =0;
		int time1 =0;
		double result =0;
		if(num1<=num2) {
			for(int i=num1;i<=num2;i++ ) {
				btNum=btNum+i;
				time1++;
			}result=(double)btNum/time1;
			System.out.println("사이의 모든 숫자의 평균은 "+result+"이다.");
		}else {
			for(int i=num2;i<=num1;i++ ) {
				btNum=btNum+i;
				time1++;
			}result=(double)btNum/time1;
			System.out.println("사이의 모든 숫자의 평균은 "+result+"이다.");
		}
		
		
	}

}
