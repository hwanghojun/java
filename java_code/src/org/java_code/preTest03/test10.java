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
			System.out.println(cum+"�Դϱ�? ");
			System.out.println("�Է��Ͻÿ�(0: �׺��� �۴�,1: �׺��� ũ��. 2: �´�.) ");
			int num = HH.nextInt();
			count++;
			if(num==2) {
				System.out.println("������"+count+"������ ������ϴ�.");
				break;
			}else if(num==1) {
				up=cum-1;
			}else if(num==0) {
				down=cum-1;
			}
			
		}
		
		
	}
}
