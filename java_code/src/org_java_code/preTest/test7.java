package org_java_code.preTest;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		//기출 9번 컴퓨터가 1부터 10사이의 임의의 숫자를 생각해내면 사용자가 맞추는 게임을 만드시오.
		Scanner HH = new Scanner(System.in);
		int cum = (int)(Math.random()*10+1);
		int time = 0;
		System.out.println("컴퓨터가 생각한 숫자를 맞춰보시오.");
		
		while(true) {
			int myNum = HH.nextInt();
			time++;
			if(myNum > cum) {
				System.out.println("작습니다. 다른 숫자를 입력하시오.");
			}if(myNum < cum) {
				System.out.println("큽니다. 다른 숫자를 입력하시오.");
			}if(myNum == cum) break;
		}System.out.println(time+"번만에 맞추었습니다.");

	}

}
