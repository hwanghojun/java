package org.java_code.preTest03;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int myNum=HH.nextInt();
		int count=0;
		int up =1;
		int down =100;
		while(true) {
			int cum=(int)(Math.random()*(up-down+1)+down);
			System.out.println(cum+"입니까? ");
			System.out.println("입력하시오(0: 그보다 작다,1: 그보다 크다. 2: 맞다.) ");
			int num = HH.nextInt();
			count++;
			if(num==2) {
				System.out.println("하하하"+count+"번만에 맞췄습니다.");
				break;
			}else if(num==1) {
				up=cum-1;
			}else if(num==0) {
				down=cum-1;
			}
			
		}
		
		
	}
}
