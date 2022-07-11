package org.java_code.baekjoon;

import java.util.Scanner;

public class b2739_new {

	public static void main(String[] args) {
		// 1부터 20 까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		int result=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0 |i%3!=0) {
				result+=i;
			}
		}
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+10) 계산하시오
		int result2=0;
		for(int i =1;i<=10;i++) {
			result+=i*(11-i);
		}
		//1+(-2)+3+(-4)+.. 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int sum=0;
		int n=0;
		int m=0;
		int count=0;
		while (true) {
			sum+=2*n+1;
			n++;
			count++;
			if(sum>100) {
				break;
			}
			sum+=-2*m-2;
			count++;
		}
		
		
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		for(int i=1;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i+j==6) {
					System.out.println(i+" "+j);
				}
			}
		}
		
		
		
	}

}
