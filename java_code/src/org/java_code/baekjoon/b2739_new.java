package org.java_code.baekjoon;

import java.util.Scanner;

public class b2739_new {

	public static void main(String[] args) {
		// 1���� 20 ������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		int result=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0 |i%3!=0) {
				result+=i;
			}
		}
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+10) ����Ͻÿ�
		int result2=0;
		for(int i =1;i<=10;i++) {
			result+=i*(11-i);
		}
		//1+(-2)+3+(-4)+.. �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
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
		
		
		//�� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		for(int i=1;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i+j==6) {
					System.out.println(i+" "+j);
				}
			}
		}
		
		
		
	}

}
