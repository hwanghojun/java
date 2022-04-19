package org_java.code_test;

import java.util.Scanner;

public class middleTest1_9 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("9번");
		System.out.println("가위 바위 보 중 하나를 고르시오.(1.가위 2. 바위 3.보) ");
	
		while(true) {
			int cum = (int)(Math.random()*3+1);
			int myNumber = HH.nextInt();
			if(myNumber<cum) {
				if(myNumber==1 && cum ==3) {
				System.out.println("나: "+myNumber);
				System.out.println("컴퓨터: "+cum);
				System.out.println("나 승");
				}else {
				System.out.println("나: "+myNumber);
				System.out.println("컴퓨터: "+cum);
				System.out.println("컴퓨터 승");
				}
			}
			if(myNumber>cum) {
				if(myNumber==3 && cum ==1) {
				System.out.println("나: "+myNumber);
				System.out.println("컴퓨터: "+cum);
				System.out.println("컴퓨터 승");
				}else {
					System.out.println("나: "+myNumber);
					System.out.println("컴퓨터: "+cum);
					System.out.println("나 승");
				}
			}
			if(myNumber==cum) {
			System.out.println("나: "+myNumber);
			System.out.println("컴퓨터: "+cum);
			System.out.println("무승부");
			}
		}
		
		
		
		
		
		
	}

}
